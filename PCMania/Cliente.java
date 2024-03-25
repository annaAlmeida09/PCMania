public class Cliente 
{
    String nome;
    long cpf;

    float calculaTotalCompra(float[] valores){
        
        float totalCompra;
        totalCompra = 0f;
        
        for(int i=0; i < valores.length; i++)
        {
            totalCompra += valores[i];
        }

        return totalCompra;
    }

}