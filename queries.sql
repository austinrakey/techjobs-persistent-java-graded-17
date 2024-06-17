--Part 1
--FIELD     TYPE   NULL   KEY   DEFAULT   EXTRA
--id        int    NO     PRI   NULL
--employer varchar(255)   YES   NULL
--name     varchar(255)   YES   NULL
--skills   varchar(255)   YES   NULL
--Part 2
SELECT name
FROM employer
WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;

--Part 4
SELECT *
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
ORDER BY name ASC;
