package sample14;

public class MyFoodMgr {
	private Food favoriteFood;
	private Food unFavoriteFood;

	public MyFoodMgr() {

	}

	public MyFoodMgr(Food favoriteFood, Food unFavoriteFood) {
		super();
		this.favoriteFood = favoriteFood;
		this.unFavoriteFood = unFavoriteFood;
	}

	public void setFavoriteFood(Food favoriteFood) {
		System.out.println("setFavoriteFood() 호출");
		this.favoriteFood = favoriteFood;
	}

	public void setUnFavoriteFood(Food unFavoriteFood) {
		System.out.println("setUnFavoriteFood() 호출");
		this.unFavoriteFood = unFavoriteFood;
	}

	@Override
	public String toString() {
		return "MyFoodMgr [favoriteFood=" + favoriteFood + ", unFavoriteFood=" + unFavoriteFood + "]";
	}

}
