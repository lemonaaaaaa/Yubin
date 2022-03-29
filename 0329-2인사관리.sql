SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees; --�ش翭������

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE department_id=50; --department id�� 50�λ��

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE department_id>=50; --ũ�ų� �������

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE department_id<>50; --50�� �ƴ� ���


SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name > 'King';
--���ڸ� ���ϴ� ���� : �ƽ�Ű�ڵ尪 ����. �������� ��繮�� ���尡�ɺҰ�. 7 bit��
--�׷��� ��������� �����ڵ�. �ڵ尪�� �ϳ��� �����ؼ� ����~ ����� �ƽ�Ű.
--��Ƽ����Ʈ�� �����ڵ�

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE hire_date =  '97/09/17';

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE hire_date >  '97-09-17';
--��¥�� �ð��� ����Ҽ��� �� ŭ. �׷��� ��Һ񱳰� �ȴ�ϴ�~
--���ڴ� ��ġ�ؾ߸� �˻���. ��¥�� �⵵�տ� ���⸦ �ٿ��� �˻��� �ȴ�ϴ�~ 1997~2022�ٴ�~
--��¥��  �����½ᵵ �ǰ� /�ᵵ �νİ���. �̱������� �Ͽ��⾲�� �νľ����� �̱����� ��������
--�ٵ� �Լ���ɳ����� �ȴٰ���. ��¼���̰�

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE salary BETWEEN 6000 AND 9000; --�̻� ������ ����.��谪 ����.
-- 9000 AND 6000���� ���Ѱ� �������� �˻������ �ȳ���.
--��¥�� ���ڿ��� �����ս�

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name BETWEEN 'Abel' AND 'King'; --�ű�ű�

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE hire_date BETWEEN '99/01/01' AND '99/12/31'; --��¥�������Դϴ� :3 ������ �Ųٷ� ���� �ȴ�ϴ�.

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE department_id IN(50, 60, 80); --50�Ǵ� 60�ΰ��� ã�ƿ�. ���Ӽ�x ����x

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name LIKE 'H%';
--H�ڿ� �ƹ��ų� �͵� �Ǵ� �� �˻�

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name LIKE '%a%o%';
--%�� ��ü����. 1���̻��� ������ ���� �ǹ�. �̰� ��¾��

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name LIKE '%s';
-- _ under bar�� �� ���ڸ� �����.

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name LIKE '_a%';

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name LIKE '__a%';
--�̰���Դ� :3

SELECT employee_id, last_name, salary, hire_date, department_id
FROM employees
WHERE last_name LIKE '____';
-- underbar 4�� ->4�����ΰ�ã�� 


SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE job_id LIKE 'IT\_%' ESCAPE '\';
-- LIKE 'IT_%' �����϶� \ ����,ESCAPE '\':��� ��������, ���ϵ�ī�尡 �ƴϴ�. 
--�տ��� ����ϰ� �ڿ��� \�ٷε��� ���ڴ� �ڷᰪ���� �˷��ִ°�.


SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id IS NULL;
-- null���� �񱳺Ұ�. = �� �񱳿����� ����. �׷��� IS NULL�̿�.


SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id = 50
AND salary > 5000;


SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id = 50
OR salary > 5000;

--NOT�� SQL�����ڿ� �Բ� ��.


SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id IN (50, 60);
-- ���Ʒ� ����
SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id =50 
OR department_id =60;

SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id NOT IN (50, 60);
--���Ʒ� ����
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


--�������� �ѹ��� �ΰ� �̻� ����
--���� �Ϸ��� ���� ������ �����ϰ� ���� �� ������� ���� ������ �´� ��.

SELECT employee_id, last_name, salary, hire_date, department_id, job_id
FROM employees
WHERE department_id =50 
OR department_id =60
AND salary > 5000
ORDER BY last_name DESC;
-- ORDER BY ��������. �׻� ���� �������ٿ� ����. ���������� DESC



SELECT *
FROM employees
WHERE salary*12 > 100000;



SELECT employee_id, last_name, salary*12 AS ���� , hire_date, department_id, job_id
FROM employees
ORDER BY 5, 3 DESC;
--������� ����.
--DESC���̸� ����
--5,3�� ������ �ѹ�. 5���� ��, 3��° ��
--ORDER BY : �����Ҷ�. �Ѱ��̻���������. ���������� ����Ʈ.



