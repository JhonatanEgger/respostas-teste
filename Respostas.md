

1

- Quando o código acima é executado, é criada uma nova Thread e executada a mesma, criando um novo processamento paralelo, concorrendo com o que ja estava em execução, a ordem de execução não é garantida, ou seja, hora irá aparecer a mensagem "Executou o final do metódo" em primeiro, hora será lançada a RuntimeException criada na linha 5.

  

2 

  

- O programa lança a exception StackOverFlowError pois excede o uso de memória, isto é causado por uma chamada recursiva sem uma condição de termino, como o metódo add() da classe NumericInput esta chamando ele mesmo (recursividade) mas não atendendo a condição de parada.

  

- Poderia ser utilizada a expresão regular : ^[1-9]\d*$

  

3

- É lançada a exception: java.lang.ClassCastException, pois o método sort não consegue comparar elementos de tipos distintos, por exemplo comparar um elemento de tipo Integer com o elemento do tipo String.

  

- As linhas 4, 5 e 6 não dão erro pois seus valores são adicionados em um array no qual o seu tipo não é declarado ficando ArrayList de object então pode ser adicionado qualquer objeto, com esta falta de tipagem o array perde sua validação dos objetos que são adicionados nele.

4 

-	a) - A declaração de retorno String não é esperado no método main, ja que a execução do mesmo não retorna nenhum valor.

-	b - A falta da declaração do atributo static não permite que a classe Test seja executada sem ser instanciada, a classe main não consegue ser encontrada para a execução e a falta da tipagem do parametro args que o método main deve receber ocasionam um erro léxico.

-	c - A falta da declaração static que não permite a classe Test ser executada sem ser instanciada e falta da declaração void para indicar que a execução não irá retornar nenhum valor.

  

5 

- A classe Son fará a execução do construtor da super classe(Man) e de sua classe pai(Father) imprimindo Man Father.

- A classe Son não poderia ser instanciada em outras classes fora dela mesma devido a limitação do modificador de acesso privado de seu construtor.

  

6 

[Ver código no projeto](https://github.com/JhonatanEgger/respostas-teste/blob/master/ProvaJava/src/br/com/exercicios/ex6/Father.java "Ver código no projeto")



```java
public String validateAge(String age) {
    
    String returnAge = null;
    
    try {
    
    	returnAge = isOld(Integer.parseInt(age))? "idoso": "jovem";
    
    	System.out.println(returnAge);
    
    } catch (NumberFormatException e) {
    
    	throw new NumberFormatException("O valor informado não é um valor numérico valido");
    
    }
    
    return returnAge;
    
}
```


  

7 
-	Alternativa B, como não foi declarado nenhum modificador de acesso para a classe Big, o modificador para ela é o default, que permite a mesma ser acessada somente por classes do mesmo pacote.

  

8 

[Ver código no projeto](https://github.com/JhonatanEgger/respostas-teste/blob/master/ProvaJava/src/br/com/exercicios/ex8/TryCatchExamples.java "Ver código no projeto")

- NullPointerException é a exceção lançada quando se tenta acessar um objeto, variavel ou propriedade ainda não instanciado.

```java
String nullPointer = null;    
nullPointer.toUpperCase();
```
  
```java
finally {
	System.out.println("Finally");
}
```

  

9 
- (Inexistente na lista de testes)

  

10 

[Ver código no projeto](https://github.com/JhonatanEgger/respostas-teste/blob/master/ProvaJava/src/br/com/exercicios/ex10/Main.java "Ver código no projeto")
```java
(int) Math.round(x);
```

  

11 

[Ver código no projeto](https://github.com/JhonatanEgger/respostas-teste/blob/master/ProvaJava/src/br/com/exercicios/ex11/Main.java "Ver código no projeto")
```java
x = x.setScale(2, 1);
```
