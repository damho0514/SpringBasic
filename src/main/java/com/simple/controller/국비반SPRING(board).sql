create table board(
    num number(10,0),
    name VARCHAR2(50),
    title VARCHAR2(50),
    content VARCHAR2(50)
);
alter table board add CONSTRAINT board_pk PRIMARY key (num);
create SEQUENCE board_seq INCREMENT BY 1 start WITH 1 NOCACHE;
insert into board(num,name,title,content) VALUES(board_seq.nextval,'±è±æµ¿','10','20');
drop table board;
