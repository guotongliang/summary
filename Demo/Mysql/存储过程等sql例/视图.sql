SELECT * FROM student WHERE studentName='李四'

-- 创建视图
CREATE VIEW view_lisi
AS
SELECT * FROM student WHERE studentName='李四';

CREATE VIEW view_zhangsan
AS 
SELECT * FROM student WHERE studentName='张三';

-- 查看视图
SELECT * FROM view_lisi;
SELECT * FROM student;

INSERT INTO view_lisi (studentName,gender,phone,address,born,gradeId)
VALUES ('admin',FALSE,'0000','北京昌平区','1990-9-9',2)

DELETE FROM view_lisi WHERE studentname='李四';


-- 复杂视图
CREATE VIEW view_stu_grade
AS
SELECT s.studentName,g.gradeName FROM student  s INNER JOIN grade g ON s.gradeId=g.gradeId;

SELECT * FROM view_stu_grade;

DELETE FROM view_stu_grade WHERE studentName='张三';

DROP VIEW view_stu_grade;

