public class Janela{	
	
	String cor;
	double alt;
	double larg;
	boolean aberta;
	
	public Janela(double alt,double larg,String cor,boolean aberta){
		this.cor = cor;
		this.alt = alt;
		this.larg = larg;
		this.aberta = aberta;
	}
	
	public String getCor() {
    		return this.cor;
  	}
  	
	public double getalt() {
    		return this.alt;
  	}
  	
  	public double getlarg() {
    		return this.larg;
  	}
  	
  	public boolean getaberta() {
    		return this.aberta;
  	}
  	
  	public void setCor(String cor) {
    		this.cor = cor;
  	}
  	
  	public void setalt(double alt) {
    		this.alt = alt;
  	}
  	
  	public void setlarg(double larg) {
    		this.larg = larg;
  	}
  	
  	public void setaberta(boolean aberta) {
    		this.aberta = aberta;
  	}
  	
	public String abtrirjanela() {
  		if(this.aberta)
  			return "A janela esta aberta";
  		this.aberta = true;
  		return "A janela foi aberta";
  	}
}
