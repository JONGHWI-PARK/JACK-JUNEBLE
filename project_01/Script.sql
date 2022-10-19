CREATE TABLE ENG_WORD (
	WORD_DAY		NUMBER(3),
	ENG		VARCHAR2(100),
	KOR		VARCHAR2(100)
);

SELECT * FROM ENG_WORD ew ;

INSERT INTO ENG_WORD values(1, 'fatigue', '피로');
INSERT INTO ENG_WORD values(1, 'checkup', '건강 진단');
INSERT INTO ENG_WORD values(1, 'symptom', '증상');
INSERT INTO ENG_WORD values(1, 'physician', '내과 의사');
INSERT INTO ENG_WORD values(1, 'diagnosis', '진단');
INSERT INTO ENG_WORD values(1, 'prescribe', '(약을)처방하다');
INSERT INTO ENG_WORD values(1, 'recovery', '회복, 쾌유');
INSERT INTO ENG_WORD values(1, 'comprehensive', '종합적인, 포괄적인');
INSERT INTO ENG_WORD values(1, 'participate', '참여하다, 참가하다');
INSERT INTO ENG_WORD values(1, 'examination', '진찰, 검사');

INSERT INTO ENG_WORD VALUES(2, 'eliminate', '제거하다');
INSERT INTO ENG_WORD VALUES(2, 'dietary', '식이 요법의, 규정식의');
INSERT INTO ENG_WORD VALUES(2, 'transmit', '전염시키다');
INSERT INTO ENG_WORD VALUES(2, 'periodically', '주기적으로');
INSERT INTO ENG_WORD VALUES(2, 'coverage', '보상 범위; 보도, 취재범위');
INSERT INTO ENG_WORD VALUES(2, 'exposure', '노출');
INSERT INTO ENG_WORD VALUES(2, 'pharmaceutical', '제약의, 약학의');
INSERT INTO ENG_WORD VALUES(2, 'premium', '보험료');
INSERT INTO ENG_WORD VALUES(2, 'relive', '완화시키다');
INSERT INTO ENG_WORD VALUES(2, 'conscious', '알고 있는, 자각하고 있는');

SELECT *
FROM ENG_WORD ew
WHERE WORD_DAY = 2
;