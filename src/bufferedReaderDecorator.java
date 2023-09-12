import java.io.BufferedReader;
import java.io.IOException;
// Decorator para ler entrada do teclado com BufferedReader
class BufferedReaderDecorator {
    private BufferedReader reader;
    // Construtor que recebe um BufferedReader para decoração
    public BufferedReaderDecorator(BufferedReader reader) {
        this.reader = reader;
    }
    // Método para ler uma linha de entrada do teclado
    public String lerLinha() {
        try {
            // Utiliza o BufferedReader interno para ler uma linha da entrada padrão
            return reader.readLine();
        } catch (IOException e) {
            // Em caso de exceção, como erro de E/S, retorna null
            return null;
        }
    }
}