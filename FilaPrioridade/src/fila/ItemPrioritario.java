package fila;

public class ItemPrioritario {

	private int prioridade;
    private Object info;

    public ItemPrioritario(int prioridade, Object info) {
        this.prioridade = prioridade;
        this.info = info;
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
