-- 给姓名创建索引
CREATE INDEX index_name
ON student (studentname);

SELECT * FROM student WHERE studentname='张三'

DROP INDEX index_name ON student;