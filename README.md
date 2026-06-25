# JavaBlackjack

Um pequeno projeto exemplo de Blackjack em Java, destinado a estudo e experimentação.

**Propósito:** Demonstrar estruturação de um projeto Java simples, jogar partidas automatizadas via terminal e servir como base para extensões (IA, GUI, rede).

## Pré-requisitos

- JDK 11 ou superior instalado e disponível no `PATH`.

## Estrutura do repositório

- src/: código-fonte Java
	- App.java — classe com o `main` que inicia o jogo
	- classes/Deck.java — implementação do baralho
	- classes/Match.java — lógica da partida
	- classes/Player.java — representação de jogador
- lib/: dependências externas (se houver)
- bin/: saída dos arquivos compilados (bin/classes/)
- run.bat: script de execução para Windows

## Como compilar e executar

Opções rápidas:

- Usando o script (Windows):

```powershell
./run.bat
```

- Compilação manual (Windows):

```powershell
javac -d bin\classes src\App.java src\classes\*.java
java -cp bin\classes App
```

- Compilação manual (Linux/macOS):

```bash
javac -d bin/classes src/*.java src/classes/*.java
java -cp bin/classes App
```

Observação: ajuste os caminhos caso a árvore de fontes mude.

## Uso

Ao executar, o programa cria uma partida simples de Blackjack entre jogadores definidos em `Match`. Consulte o código em `src/classes/Match.java` para entender regras e fluxo.

## Contribuição

- Abra uma issue descrevendo a proposta.
- Envie pull requests pequenos e focados.

## Licença

Veja o arquivo `license` na raiz do repositório para detalhes sobre a licença.