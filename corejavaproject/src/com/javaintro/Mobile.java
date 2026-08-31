package com.javaintro;
	public class Mobile {
		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			super.finalize();
			System.out.println("company");
		}

		public static void main(String[] args) {
			Mobile oppo = new Mobile();
			System.out.println(oppo);
			
			Mobile realme = new Mobile();
			System.out.println(realme);
			
			oppo = null;
			realme = null;
			
			System.gc();
			System.out.println("Mobile");

		}

	}
