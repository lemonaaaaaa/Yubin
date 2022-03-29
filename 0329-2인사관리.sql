SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees; --해당열목록출력

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE department_id=50; --department id가 50인사람

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE department_id>=50; --크거나 같은사람

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE department_id<>50; --50이 아닌 사람


SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name > 'King';
--글자를 비교하는 기준 : 아스키코드값 기준. 전세계의 모든문자 저장가능불가. 7 bit라서
--그래서 만들어진게 유니코드. 코드값을 하나로 통일해서 쓰자~ 영어는 아스키.
--멀티바이트는 유니코드

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE hire_date =  '97/09/17';

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE hire_date >  '97-09-17';
--날짜는 시간이 경과할수록 더 큼. 그래서 대소비교가 된답니다~
--문자는 일치해야만 검색됨. 날짜는 년도앞에 세기를 붙여도 검색이 된답니다~ 1997~2022다댐~
--날짜는  하이픈써도 되고 /써도 인식가능. 미국식으로 일월년쓰면 인식안해줌 미국놈들아 정신차려
--근데 함수기능넣으면 된다고함. 개쩌네이거

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE salary BETWEEN 6000 AND 9000; --이상 이하의 개념.경계값 포함.
-- 9000 AND 6000으로 상한값 먼저쓰면 검색결과가 안나옴.
--날짜나 문자에도 쓸수잇슴

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name BETWEEN 'Abel' AND 'King'; --신기신기

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE hire_date BETWEEN '99/01/01' AND '99/12/31'; --날짜도가능함니다 :3 하지만 거꾸로 쓰면 안댑니다.

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE department_id IN(50, 60, 80); --50또는 60인것을 찾아옴. 연속성x 범위x

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name LIKE 'H%';
--H뒤에 아무거나 와도 되는 것 검색

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name LIKE '%a%o%';
--%는 대체문자. 1개이상의 임의의 문자 의미. 이거 개쩐당

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name LIKE '%s';
-- _ under bar는 한 문자를 대신함.

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name LIKE '_a%';

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name LIKE '__a%';
--이고재밋당 :3

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name LIKE '____';
-- underbar 4개 ->4글자인걸찾음 


SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE job_id LIKE 'IT\_%' ESCAPE '\';
-- LIKE 'IT_%' 예외일때 \ 삽입,ESCAPE '\':얘는 데이터지, 와일드카드가 아니다. 
--앞에서 사용하고 뒤에서 \바로뒤의 문자는 자료값임을 알려주는것.


SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id IS NULL;
-- null값은 비교불가. = 등 비교연산자 못씀. 그래서 IS NULL이용.


SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id = 50
AND salary > 5000;


SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id = 50
OR salary > 5000;

--NOT은 SQL연산자와 함께 씀.


SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id IN (50, 60);
-- 위아래 같음
SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id =50 
OR department_id =60;

SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id NOT IN (50, 60);
--위아래 같음
SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id <> 50
AND department_id <> 60;


SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name NOT LIKE '%a%';


SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id IS NOT NULL;
-- IS NOT NULL  / IS NULL


--논리연산은 한번에 두개 이상 못함
--세개 하려면 앞의 조건을 만족하고 이후 그 결과값과 다음 조건이 맞는 것.

SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id =50 
OR department_id =60
AND salary > 5000
ORDER BY last_name DESC;
-- ORDER BY 오름차순. 항상 제일 마지막줄에 삽입. 내림차순은 DESC



SELECT *
FROM employees
WHERE salary*12 > 100000;



SELECT employee_id, last_name, salary*12 AS 연봉 , hire_date, department_id, job_id
FROM employees
ORDER BY 5, 3 DESC;
--순서대로 정렬.
--DESC붙이면 역순
--5,3은 포지션 넘버. 5번쨰 열, 3번째 열
--ORDER BY : 정렬할때. 한개이상조건으로. 오름차순이 디폴트.



