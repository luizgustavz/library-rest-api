INSERT INTO tb_library (uuid, image_url, title, short_description, long_description, publisher) VALUES ('35f67997-0b52-488f-ab94-49babb6d8eb4','http://imagemdolivroaqui.dominio','Mais esperto que o diabo','Short description','Long description','publisher book 1');
INSERT INTO tb_library (uuid, image_url, title, short_description, long_description, publisher) VALUES ('246f4cc0-9fda-43d8-b9f0-9f58a8b46730','http://imagemdolivroaqui.dominio','As dores do mundo','Short description','Long description','publisher book 2');
INSERT INTO tb_library (uuid, image_url, title, short_description, long_description, publisher) VALUES ('d5bd9c6b-d73d-439d-82c3-2a1d99dec211','http://imagemdolivroaqui.dominio','O imbecil coletivo','Short description','Long description','publisher book 3');
INSERT INTO tb_library (uuid, image_url, title, short_description, long_description, publisher) VALUES ('5d255c58-cdd6-4a97-b5a0-5dcbc266bcda','http://imagemdolivroaqui.dominio','Java 8','Short description','Long description','publisher book 4');
INSERT INTO tb_library (uuid, image_url, title, short_description, long_description, publisher) VALUES ('52df99a7-b952-46c6-b206-d974cdd6ddad','http://imagemdolivroaqui.dominio','Como fazer amigos e influenciar pessoas','Short description','Long description','publisher book 5');
INSERT INTO tb_library (uuid, image_url, title, short_description, long_description, publisher) VALUES ('8931609e-0880-4dc7-9519-c4fec86a04ae','http://imagemdolivroaqui.dominio','Banco de dados','Short description','Long description','publisher book 6');
INSERT INTO tb_library (uuid, image_url, title, short_description, long_description, publisher) VALUES ('b63c2669-1299-47d2-a702-6fc7060886b1','http://imagemdolivroaqui.dominio','O homem mais rico da babilonia','Short description','Long description','publisher book 7');
INSERT INTO tb_library (uuid, image_url, title, short_description, long_description, publisher) VALUES ('986ebb03-5fa9-4ea9-bbd2-fb1a2309bdac','http://imagemdolivroaqui.dominio','A sutil arte de ligar o fodase','Short description','Long description','publisher book 8');
INSERT INTO tb_library (uuid, image_url, title, short_description, long_description, publisher) VALUES ('ed279d29-277c-4540-b19f-6b22713a22bb','http://imagemdolivroaqui.dominio','Carta ao pai','Short description','Long description','publisher book 9');
INSERT INTO tb_library (uuid, image_url, title, short_description, long_description, publisher) VALUES ('d7e9790d-8d70-45b6-9044-9094cca60575','http://imagemdolivroaqui.dominio','A Metamorfose','Short description','Long description','publisher book 10');

INSERT INTO tb_list_book (name) VALUES ('Ficcao');
INSERT INTO tb_list_book (name) VALUES ('Literatura');

INSERT INTO tb_belonging (list_id, library_id, index) VALUES (2, '8931609e-0880-4dc7-9519-c4fec86a04ae', 0)
INSERT INTO tb_belonging (list_id, library_id, index) VALUES (2, '246f4cc0-9fda-43d8-b9f0-9f58a8b46730', 1)
INSERT INTO tb_belonging (list_id, library_id, index) VALUES (1, 'ed279d29-277c-4540-b19f-6b22713a22bb', 2)
INSERT INTO tb_belonging (list_id, library_id, index) VALUES (1, '35f67997-0b52-488f-ab94-49babb6d8eb4', 3)
