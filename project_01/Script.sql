CREATE TABLE ENG_WORD (
	WORD_DAY		NUMBER(3),
	ENG		VARCHAR2(100),
	KOR		VARCHAR2(100)
);

SELECT * FROM ENG_WORD ew ;

INSERT INTO ENG_WORD values(1, 'fatigue', '�Ƿ�');
INSERT INTO ENG_WORD values(1, 'checkup', '�ǰ� ����');
INSERT INTO ENG_WORD values(1, 'symptom', '����');
INSERT INTO ENG_WORD values(1, 'physician', '���� �ǻ�');
INSERT INTO ENG_WORD values(1, 'diagnosis', '����');
INSERT INTO ENG_WORD values(1, 'prescribe', '(����)ó���ϴ�');
INSERT INTO ENG_WORD values(1, 'recovery', 'ȸ��, ����');
INSERT INTO ENG_WORD values(1, 'comprehensive', '��������, ��������');
INSERT INTO ENG_WORD values(1, 'participate', '�����ϴ�, �����ϴ�');
INSERT INTO ENG_WORD values(1, 'examination', '����, �˻�');

INSERT INTO ENG_WORD VALUES(2, 'eliminate', '�����ϴ�');
INSERT INTO ENG_WORD VALUES(2, 'dietary', '���� �����, ��������');
INSERT INTO ENG_WORD VALUES(2, 'transmit', '������Ű��');
INSERT INTO ENG_WORD VALUES(2, 'periodically', '�ֱ�������');
INSERT INTO ENG_WORD VALUES(2, 'coverage', '���� ����; ����, �������');
INSERT INTO ENG_WORD VALUES(2, 'exposure', '����');
INSERT INTO ENG_WORD VALUES(2, 'pharmaceutical', '������, ������');
INSERT INTO ENG_WORD VALUES(2, 'premium', '�����');
INSERT INTO ENG_WORD VALUES(2, 'relive', '��ȭ��Ű��');
INSERT INTO ENG_WORD VALUES(2, 'conscious', '�˰� �ִ�, �ڰ��ϰ� �ִ�');

SELECT *
FROM ENG_WORD ew
WHERE WORD_DAY = 2
;