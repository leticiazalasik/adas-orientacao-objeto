package Bercario;

import java.util.List;

public interface repositorioBebe {

	public void create(Bebe bebe);
	
	public void delete (Bebe bebe); //posso passar uma instacia ou referencia de id no banco 
	
	public void update (Bebe bebe); 
	
	public List<Bebe> ready (); 
}
