package builder;

public class NutritionFacts {

	private final int servingSize;
	private final int servings;
	private final int fat;
	private final int calories;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder{
		private final int servingSize;
		private final int servings;
		
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;
		
		public Builder(int servingSize,int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		} 
		
		public Builder fat(int val){
			fat = val;
			return this;
		}
		public Builder carbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		public Builder sodium(int val){
			sodium = val;
			return this;
		}
		public Builder calories(int val){
			calories = val;
			return this;
		}
		
		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
	}
	
	private NutritionFacts(Builder builder) {
		servings = builder.servings;
		servingSize = builder.servingSize;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
}
