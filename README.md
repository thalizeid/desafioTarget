<h1>Desafios de Lógica</h1>

<p>Pequeno desafio proposto pela Target para serem resolvidos em Java</p>


-------------------------------------------------------

Respostas das questões 4 e 5:

4) a: 9 // b: 128 // c: 49 // d: 100 // e: 13 // f: 200

5) Nomeando interruptores 1, 2, 3 e salas A, B, C.
   Ligo o interruptor 1 e 2 por 10 minutos, para que as lâmpadas aqueçam, mesmo se forem de led.
   Desligo o interruptor 2. Vou a sala A, caso esteja acesa, fica a combinação 1+A, caso esteja apagada e quente fica a combinação 2+A, caso esteja apagada e fria, fica a combinação 3+A.
   Volto para a sala dos interruptores e ligo apenas o 3, desligando o 1(que já definimos a combinação).
   Entro na sala B, caso esteja acesa, fica a combinação 3+B, caso esteja apagada e quente, fica a combinação 2+B, o que restar será a combinação da sala C.
