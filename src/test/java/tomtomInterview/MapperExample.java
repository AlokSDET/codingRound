package tomtomInterview;

public class MapperExample {

	static	class  user {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public user(String name) {
			super();
			this.name = name;

		}
		
		public boolean isAlok(String name) {
			return (name.equals("Alok"))?true:false;
		}

		@Override
		public String toString() {
			return "user [name=" + name + "]";
		}

	}
}
