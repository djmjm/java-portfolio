package streamapi;

import java.util.ArrayList;
import java.util.List;

public class Movimento {
		private final List<Direcao> passos = new ArrayList<Direcao>();
		
		public Movimento() {
			passos.add(Direcao.leste);
			passos.add(Direcao.leste);
			passos.add(Direcao.leste);
			passos.add(Direcao.sul);
		}
		
		public List<Direcao> getPassos(){
			return passos;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return passos.toString();
		}
}