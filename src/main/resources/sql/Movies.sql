truncate table public.movies RESTART IDENTITY;

INSERT INTO public.movies(
	title, status, year, release_date, 
	"cast", overview, cover, created_at, updated_at
)
VALUES
	(
		'Bad Boys Para Sempre', 'Em breve', '2020', '2020/01/30',
		'{"Will Smith","Martin Lawrence","Vanessa Hudgens","Alexander Ludwig"}',
		'Os policiais Mike Lowery e Marcus Burnett se juntam para derrubar o líder de um cartel de drogas em Miami. A recém-criada equipe de elite do departamento de polícia de Miami, ao lado de Mike e Marcus, enfrenta o implacável Armando Armas.',
		'badboy3.jpg',current_timestamp,current_timestamp
	);

INSERT INTO public.movies(
	title, status, year, release_date,
	"cast", overview, cover, created_at, updated_at
)
VALUES
	(
		'Star Wars: A Ascensão Skywalker', 'Disponível', '2019', '2019/12/19',
		'{"Daisy Ridley","Mark Hamill","Adam Driver","Oscar Isaac","Keri Russell","Jhon Boyega"}',
		'Com o retorno do Imperador Palpatine, todos voltam a temer seu poder e, com isso, a Resistência toma a frente da batalha que ditará os rumos da galáxia.',
		'starwarsend.jpg',current_timestamp,current_timestamp
	);

INSERT INTO public.movies(
	title, status, year, release_date,
	"cast", overview, cover, created_at, updated_at
)
VALUES
	(
		'Bad Boys II', 'Em breve', '2003', '2003/09/30',
		'{"Will Smith","Martin Lawrence","Gabrielle Union","Joe Pantoliano", "JJordi Mollà"}',
		'Os detetives da Narcóticos Marcus Burnett e Mike Lowrey são designados para investigar a proliferação do ecstasy na cidade de Miami.',
		'BadBoys2.jpg',current_timestamp,current_timestamp
	);