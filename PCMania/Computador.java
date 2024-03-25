public class Computador {

    private final HardwareBasico processador;
    private HardwareBasico armazenamento;
    private HardwareBasico memoriaPcRAM;
    private SistemaOperacional sistema;
    private MemoriaUSB memoriaPcUSB;

    String marca;
    float preco;

    public Computador(String marca, float preco, HardwareBasico processador, HardwareBasico memoriaPcRAM, HardwareBasico armazenamento, SistemaOperacional sistema) {
        this.marca = marca;
        this.preco = preco;
        this.processador = processador;
        this.memoriaPcRAM = memoriaPcRAM;
        this.armazenamento = armazenamento;
        this.sistema = sistema;
    }

    void mostraPCConfigs()
    {
        System.out.println("Informacoes do pc.");
        System.out.println("================================================================");
        System.out.println("Marca: " + this.marca);
        System.out.println("Memoria RAM: " + this.memoriaPcRAM.capacidade + "Gigabytes");
        System.out.println("Processador: " + this.processador.nome + "de" + this.processador.capacidade + " Mhz");
        System.out.println("Sistema operacional: " + this.sistema.nome);
        System.out.println("Armazenamento: " + this.armazenamento.capacidade);
        System.out.println("Preço: R$ "+this.preco);
        System.out.println("Memoria USB: " + this.memoriaPcUSB.nome + " " + this.memoriaPcUSB.capacidade);
    }
    void addMemoriaUSB(MemoriaUSB musb)
    {
        memoriaPcUSB = musb;
    }
}
