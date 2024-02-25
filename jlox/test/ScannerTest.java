import static org.junit.jupiter.api.Assertions.*;

class ScannerTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void scanTokens() {
        Scanner scanner = new Scanner("! != (()),{}");
        TokenType[] expected = {TokenType.BANG, TokenType.BANG_EQUAL, TokenType.LEFT_PAREN, TokenType.LEFT_PAREN, TokenType.RIGHT_PAREN,
        TokenType.RIGHT_PAREN, TokenType.COMMA, TokenType.LEFT_BRACE, TokenType.RIGHT_BRACE, TokenType.EOF};
        assertArrayEquals(expected, scanner.scanTokens().stream().map(token -> token.type).toArray());
    }
}