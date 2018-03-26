CREATE DATABASE mydb;
CREATE TABLE student
(
  stu_id INT PRIMARY KEY AUTO_INCREMENT,
  stu_name VARCHAR(20) NOT NULL
);

CREATE TABLE teacher
(
  tea_id INT PRIMARY KEY ,
  tea_name VARCHAR(20) NOT NULL
);

-- 中间表：student_teacher
CREATE TABLE student_teacher
(
  stu_id INT NOT NULL,
  tea_id INT NOT NULL,
  PRIMARY KEY(stu_id,tea_id),
  FOREIGN KEY (stu_id) REFERENCES student(stu_id),
  FOREIGN KEY(tea_id) REFERENCES teacher(tea_id)
);

DESC student_teacher;
