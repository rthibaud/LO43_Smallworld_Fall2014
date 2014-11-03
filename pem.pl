personne(pierre).
personne(martin).
personne(henri).
personne(anne).

habite(pierre,paris).
habite(martin,lyon).
habite(henri,belfort).
habite(anne,paris).

amis('Hervé',X) :- personne(X), X \= pierre.

afficher( X ) :- write( X ).


fib( 0,1 ).
fib( 1,1 ).
fib( N,R ) :- N > 1, N1 is N-1, fib( N1,R1 ), N2 is N-2, fib( N2,R2 ), R is R1+R2.
