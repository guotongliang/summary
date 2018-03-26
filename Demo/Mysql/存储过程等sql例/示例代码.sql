-- 查询Student表中的学生人数

SELECT COUNT(*) FROM student

SELECT SUM(studentResult) FROM result;

SELECT AVG(studentResult),SUM(studentResult),MAX(studentResult) ,MIN(studentResult) FROM result;

SELECT * FROM student;
-- 1.各个年级的学生人数：group by
SELECT COUNT(*) AS 人数,gradeId AS 年级编号 FROM student GROUP BY gradeId;

-- 2.要求：查询来自上海的学生按照年级进行分组,显示人数超过1人的信息，要求按照人数降序显示

SELECT gradeId, COUNT(*) FROM student 
WHERE address='上海' 
GROUP BY gradeId 
HAVING COUNT(*)>1
ORDER BY COUNT(*) ASC;