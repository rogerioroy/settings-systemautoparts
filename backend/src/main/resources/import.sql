INSERT INTO tb_category(name, created_At) VALUES ('Books', NOW())
INSERT INTO tb_category(name, created_At) VALUES ('Electronics', NOW())
INSERT INTO tb_category(name, created_At) VALUES ('Computers', NOW())

INSERT INTO tb_taxcode(CFOP, description, application) VALUES ('5405', 'Merchandise Sales' , 'Sales of goods acquired or received from third parties in an operation with goods subject to the tax substitution regime, as a substituted taxpayer')
INSERT INTO tb_taxcode(CFOP, description, application) VALUES ('6404', 'Sale out of State' , 'Sales of goods subject to the tax substitution regime, as a tax substitute, exclusively in cases where the tax has already been previously withheld')
INSERT INTO tb_taxcode(CFOP, description, application) VALUES ('5411', 'Return of Goods' , 'Returns of goods purchased to be sold, whose entries have been classified as “Purchase for sale in an operation with goods subject to the tax substitution regime')