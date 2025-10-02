# Informe de corrección función para definir si un número es grande
## Definición 
Sea $d y e$ dos enteros que cumplen $d\geq\ y\  e>1$, y la función definida $f_{d,e}:\mathbb{Z}\rightarrow[0,1]$.

$$
f_{d,e}(n) =
\begin{cases}
0, & n \leq 0, \\[6pt]
\left( \dfrac{n}{n+d} \right)^e, & n > 0
\end{cases}
$$

¿Qué se desea demostrar?

1. Que todo entero evaluado en la función le corresponde un número real entre 0 y 1 incluidos, es decir $f_{d,e}(n) \in [0,1]$ para todo $n \in \mathbb{Z}$
2. $f_{d,e}$ es continua y creciente para todo valor de $n>0$ 

### Evaluación del rango
para $n \leq 0$ se tiene que $f_{d,e}(n)$ es $0$ y por lo tanto se encuentra en el rango $[0,1]$ definido.
Por otro lado, cuando $n > 0$ se tiene $\left( \dfrac{n}{n+d} \right)^e$ y se debe de cumplir $d \geq 1$, con lo que se 
infiere que $0<n<n+d$, dando :</br>

$0<f(n)=\dfrac{n}{n+d}<1$

Y como e se define como un entero mayor a 1, $e>1$, se cumple $$0<f(n)=\left(\dfrac{n}{n+d}\right)^e<1$$ 

### Evaluación de continuidad y comportamiento

$\lim_{n\rightarrow0^+}\left(\dfrac{n}{n+d}\right)^e =\left(\lim_{n\rightarrow0^+}\dfrac{n}{n+d}\right)^e=0^e=0$

$\lim_{n\rightarrow\infty}\left(\dfrac{n}{n+d}\right)^e = \left(\lim_{n\rightarrow\infty}\dfrac{\infty}{\infty+d}\right)^e=\left(\lim_{n\rightarrow\infty}\dfrac{\infty}{\infty}\right)^e=(\lim_{n\rightarrow\infty}1)^e=1^e=1$

los anteriores limites demuestran que por 0 a la derecha existe continuidad dando como resultado 0, y al evaluar al infinito se tiene que converge en 1,
lo que da a enterder que es creciente de 0 a 1 a medida que n se acerca al infinito. sumado a que la función solo se aplica a
$n>0\$ no se presentan asintotas por la función racional asi $e$ sea impar y permita la aparicion de una asintota vertical

### Conclusión

$\forall n  \in  \mathbb{Z},\ \forall d  \in  \mathbb{Z},\ d \geq 1,\ \forall e  \in  \mathbb{Z}, \ e > 1 : 0 \leq f_{d,w}(n) \leq1$


