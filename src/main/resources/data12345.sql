delete from box;

INSERT INTO public.box(id, description, name)
	VALUES (11, 'первый', 'b1'),
	        (12, 'второйй', 'b2'),
	        (13, 'третий', 'b3');

alter sequence hibernate_sequence restart with 100;
