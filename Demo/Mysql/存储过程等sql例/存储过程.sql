-- 创建存储过程

--(
--IN:是输入参数的关键字
--DECLARE:声明变量
--DEFAULT:赋初始值
--)
DELIMITER $$
CREATE PROCEDURE pro_add
(
	IN number INT
)
BEGIN
	DECLARE i INT DEFAULT 0;
	WHILE i<number DO
		INSERT INTO demo (id,content) VALUES (i,i+'A');
		SET i=i+1;
	END WHILE;
END $$
DELIMITER;
-- 调用存储过程
CALL pro_add(100);

SELECT * FROM demo;


-- ==============================模拟银行转钱===================================

DELIMITER $$
CREATE PROCEDURE pro_bank
(
	IN mymoney DOUBLE,
	IN i INT  -- 0:停电   
)
BEGIN
	-- 事务：开始事务   提交事务  回滚事务
	
	
	START TRANSACTION;	-- 开始事务
	-- 张三：减钱
	UPDATE bank SET  money=money-mymoney WHERE NAME='张三';
	-- 停电
	IF i=0 THEN
		ROLLBACK;	-- 回滚事务（撤销之前的操作）
	ELSE 
		-- 李四：加钱
		UPDATE bank SET  money=money+mymoney WHERE NAME='李四';
		COMMIT;		-- 提交事务
	
	END IF;
END $$
DELIMITER;
-- 调用存储过程
CALL pro_bank(1000,1);


-- ==========================================================================
DELIMITER $$
CREATE PROCEDURE pro_bank_zh
(
	IN mymoney DOUBLE -- 输入参数
)
BEGIN
	DECLARE num DOUBLE;
	START TRANSACTION;
	UPDATE bank SET  money=money-mymoney WHERE NAME='张三';
	SELECT money INTO num FROM bank WHERE NAME='张三';
	-- 判断钱数
	IF num<0 THEN
		-- 回滚事务
		ROLLBACK;
	ELSE
		-- 李四加钱
		UPDATE bank SET  money=money+mymoney WHERE NAME='李四';
		COMMIT;
	END IF;
	
	
END $$
DELIMITER;

-- 调用存储过程
CALL pro_bank_zh(1000);

-- ================================================================================
 -- 得到Student表中的学生人数
DELIMITER $$
CREATE PROCEDURE pro_getCount
(
	OUT number INT -- 输出参数
)
BEGIN
	SELECT COUNT(*) INTO number FROM student;
END $$
DELIMITER;

CALL pro_getCount(@num);
SELECT @num;

