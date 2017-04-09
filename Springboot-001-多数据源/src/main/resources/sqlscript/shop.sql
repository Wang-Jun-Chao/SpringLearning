#向master和slaver两个数据库中各建立一张表
CREATE TABLE t_shop (
    id        INT PRIMARY KEY,
    shop_name CHAR(64) NOT NULL
);
# 向master库中插入一条记录
INSERT INTO t_shop(id, shop_name) VALUES (1, 'MasterShop');
# 向slaver库中插入一条记录
INSERT INTO t_shop(id, shop_name) VALUES (1, 'SlaverShop');


