package fila;

public class ItemPrioritario {

    private Object info;
	private int prioridade;


    public ItemPrioritario(Object info, int prioridade) {
        this.info = info;
        this.prioridade = prioridade;

    }

    public int getPrioridade() {
        return prioridade;
    }

    public Object getInfo() {
        return info;
    }

	@Override
	public String toString() {
		return "" + info;
	}
	
    
}
