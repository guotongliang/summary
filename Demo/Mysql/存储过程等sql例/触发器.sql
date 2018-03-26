-- 插入年级表时进行记录
DELIMITER $$
CREATE TRIGGER tri_grade BEFORE INSERT ON grade FOR EACH ROW
BEGIN
	INSERT INTO logges (content) VALUES ('插入年级表');
END $$
DELIMITER;

-- 年级表插入信息
INSERT INTO grade (gradeName) VALUES ('a');
INSERT INTO grade (gradeName) VALUES ('b');