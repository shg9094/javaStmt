package ifelse;



public class Kaup {

	
		private String name;
		private int kaup;
		private double height,weight;
		private String result;
		public String getName() {
			
			return name;
			
		}
		public void setName(String name) {
			
			this.name = name;
			
		}
		public int getKaup() {
			
			return kaup;
			
		}
		public void setKaup(int kaup) {
			
			this.kaup = kaup;
			
		}
		public double getHeight() {
			
			return height;
			
		}
		public void setHeight(double height) {
			
			this.height = height;
			
		}
		public double getWeight() {
			
			return weight;
			
		}
		public void setWeight(double weight) {
			
			this.weight = weight;
			
		}
		public String getResult() {
			
			return result;
			
		}
		public void setResult(String reult) {
			
			this.result = result;
			
		}
	public void setResult() {
		setKaup();
		String temp = "";
		if (kaup > 30) {
			
			temp = "비만";
					
		} else if (kaup >= 20) {
			
			temp = "정상";
					
		} else if (kaup >= 15) {
			
			temp = "저체중";
					
		} else if (kaup >= 13) {
			
			temp = "마름";
					
		} else if (kaup >= 10) {
			
			temp = "영양실조";
					
		}else {
			 
			temp = "소모중";
			
		}
		
		this.result = temp;
		
	}
	@Override
	public String toString() {
		
		return "카우푸지수 [이름 =" + name +",+ 결과"+ "\t"+result +"]";  
				
				}
	
	
}


