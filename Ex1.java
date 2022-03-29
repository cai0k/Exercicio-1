public class Ex1{
    private String nome;
    private String endereco;
    private int c;
    private boolean d;
    
    public boolean getD(){
        return d;
    }
    public void setD(boolean d){
        this.d = d;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public int getC(){
        return c;
    }
    public void setC(int c){
        this.c = c;
    }
    
    
    public void Status(){
        this.setC(456);  
        this.setD(true);
        this.setEndereco("Salvador");
        this.setNome("Caio");
       System.out.println("Nome: "+this.nome);
       System.out.println("Endereco: "+this.endereco);
       System.out.println("Inteiro: "+this.c);
       System.out.println(this.d);

    }
    
}
