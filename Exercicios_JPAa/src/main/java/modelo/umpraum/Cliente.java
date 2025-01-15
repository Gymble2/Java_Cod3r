package modelo.umpraum;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cliente {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private String name;
						
		@OneToOne(cascade = CascadeType.PERSIST)
		@JoinColumn(name = "assento_id", unique = true)
		private Assento assento;
		
		public Cliente() {
			// TODO Auto-generated constructor stub
		}
		
		public Cliente(String name, Assento assento) {
			super();
			this.name = name;
			this.assento = assento;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Assento getAssento() {
			return assento;
		}

		public void setAssento(Assento assento) {
			this.assento = assento;
		}
		
}
