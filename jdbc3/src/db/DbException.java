package db;
//exce��o personalizada para acesso a dados.
public class DbException extends RuntimeException{
	
	public DbException(String msg) {
		super(msg);
	}

}
