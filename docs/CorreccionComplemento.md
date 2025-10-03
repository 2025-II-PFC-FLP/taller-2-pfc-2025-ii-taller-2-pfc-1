# Informe de corrección función complemento para conjuntos difusos

Sea $A$ un conjunto difuso con función de pertenencia $f_A:\mathbb{Z}\rightarrow[0,1]$.
</br>Se define el complemento de $A$ como $A^c$ dado
$$
f_{A^c}(n)=1-f_A(n),\qquad \forall n\in \mathbb{Z}
$$

¿Qué se desea demostrar?
1. demostrar la clausura de $f_{A^c}(n)$.
2. demotrar que el doble complemento de $f_A(n)$ dará $f_A(n)$
3. leyes de morgan para demostrar que el complemento de la intersección o unión de dos conjuntos es igual que los complementos de ambos unidos o intersectado.
4. continuidad del complemento

## Evaluación de la clausura
Dado $n\in \mathbb{Z}$ se tiene $0\leq f_A(n)\le1$, por lo tanto
$$
0\le 1-f_A(n)\le1\quad\Rightarrow\quad f_{A^c}(n)\in[0,1].
$$

## Evaluación del doble complemento
$$
f_{(A^c)^c}(n)=1-f_{A^c}(n)=1-(1-f_A(n))=1-1+f_A(n)=f_A(n).
$$

## Evaluación de leyes De Morgan
$(A\cap B)^c=A^c\cup B^c$.
$$
f_{(A\cup B)^c}(n)=1-\max(f_A(n),f_B(n))=\min(1-f_A(n),1-f_B(n))=f_{A^c\cap B^c}(n).
$$

$(A\cup B)^c=A^c\cap B^c$.
$$
f_{(A\cap B)^c}(n)=1-\min(f_A(n),f_B(n))=\max(1-f_A(n),1-f_B(n))=f_{A^c\cup B^c}(n).
$$

## Evaluación de continuidad del complemento
Si $f_A$ es continua se tiene por lo tanto que $1-f_{A^c}$ también ya que la sustracción en el númerador no afecta y como la clausura $f_{A^c}(n)\in[0,1]$.</br>

Y si $f_A$ es diferenciable en algún punto, se tiene que $f´_{A^c}(n) = \dfrac{d}{dy}(1-f_A)=0-f´_A=-f´_A$

### Conclusión

$\forall n  \in  \mathbb{Z}: 0 \leq f_{A^c}(n) \leq1$





