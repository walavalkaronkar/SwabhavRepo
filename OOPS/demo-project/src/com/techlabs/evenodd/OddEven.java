package com.techlabs.evenodd;

public class OddEven {

	private static int oddIndex;
	private static int evenIndex;
	private int maxValue;
	public OddEven()
	{
		maxValue=10;
	}
	
	public void setMaxValue(int maxValue)
	{
		this.maxValue=maxValue;
	}
	
	public Odd[] giveOddNumber() {
		Odd[] odd = new Odd[maxValue / 2 + 1];
		for (int index = 0; index <= maxValue; index++) {
			if (index % 2 != 0) {
				odd[oddIndex] = new Odd(index);
				oddIndex++;
			}
		}
		return odd;
	}

	public void printOddNumber(Odd[] odd) {
		System.out.println("\nOdd Numbers");
		for (int index = 0; index < oddIndex; index++) {
			int number = odd[index].getNumber();
			System.out.print(number + " ");
		}
	}

	public Even[] giveEvenNumber() {
		Even[] even = new Even[maxValue / 2 + 1];
		for (int index = 0; index <= maxValue; index++) {
			if (index % 2 == 0) {
				even[evenIndex] = new Even(index);
				evenIndex++;
			}
		}
		return even;
	}

	public void printEvenNumber(Even[] even) {
		System.out.println("\nEven Numbers");
		for (int index = 0; index < evenIndex; index++) {
			int number = even[index].getNumber();
			System.out.print(number + " ");
		}
	}
}
