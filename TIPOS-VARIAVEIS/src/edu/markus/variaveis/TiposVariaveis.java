package edu.markus.variaveis;
public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
    

         boolean portaAberta = true;  /*true or false */
         char sexo = 'M';            /* recebe apenas 1 caractere */
         byte idade =123;            /* valor de memoria alocada e de 1 byte*/
         short ano = 2021;           /* */
         int cep = 13078385;          /* valores que se iniciam com 0 podem causar erro*/
         long cpf = 46926889380L;     /* valores que se iniciam com 0 podem causar erro */
         float pi = 3.14F;           /* obrigatoriamente necessita do F ao final do valor */
         double salario = 2190.00D;   /* nao e obrigatorio o D ao final */
            
    
    //Java e uma linguagem fortemente tipada, por isso precisamos dar atencao ao escolher os tipos das variaveis para evitar possiveis errois como exemplo a seguir:
    
       
            short numeroCurto= 1;
            int numeroNormal = numeroCurto;
                System.out.println(numeroNormal); // aqui o valor short consegue "entrar" no espaco de um int 

        /*   short numeroCurto = numeroNormal;
                System.out.println(numeroCurto);     aqui o codigo gera um erro pois o valor de int jamais entrara em um short pois ocupa mais espaco em memoria
                
        */
            short numeroCurto2 = (short) numeroNormal;// nesse caso forcamos a entrada do int dentro de um short o valor em questao se encaixa no espaco de memoria, isso nao e recomendado pois se caso o valor for maior o codigo nao ira compilar
                System.out.println(numeroCurto2);       
        

        // Agora iremos mostrar com criar variaveis que nao podem ser alteradas
        
           
            int numero = 2;
                                    
            numero =10;
                System.out.println(numero);// aqui podemos observar que definimos um valor de 2 para variavel numero, logo apos alteramos para 10.
            
            final float valorPi = 3.14F;
                System.out.println(valorPi);
        //  valorPi = 5      se caso tentar executar essa linha sera gerado um erro de syntax, pois acima definimos um valor fixo para valorPi
        }
}
