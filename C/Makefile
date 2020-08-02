#!make -f

all: normal.out bounds.out leak.out address.out null.out
	./normal.out
	./bounds.out
	./address.out
	./leak.out
	./null.out


normal.out: main.c
	gcc main.c -o normal.out

bounds.out: main.c
	gcc -fsanitize=bounds main.c -o bounds.out

address.out: main.c
	gcc -fsanitize=address main.c -o address.out

leak.out: main.c
	gcc -fsanitize=leak main.c -o leak.out

null.out: main.c
	gcc -fsanitize=null main.c -o null.out

clean:
	rm -f *.out
