package alist;

import static org.junit.Assert.*;

import org.junit.Test;

public class AListTest {
	@Test
	public void testAddEnd_many()
	{
		AList pp = new AList();
		int[] ini = {10,20,33,55,12,45};
		pp.init(ini);
		pp.addEnd(5);
		assertEquals(7, pp.size());
		assertEquals(5, pp.get(pp.size()-1));
		int [] exp={10,20,33,55,12,45,5};
		int [] act=pp.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_2()
	{
		AList pp = new AList();
		int[] ini = {10,20};
		pp.init(ini);
		pp.addEnd(5);
		assertEquals(3, pp.size());
		assertEquals(5, pp.get(pp.size()-1));
		int [] exp={10,20,5};
		int [] act=pp.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_1()
	{
		AList pp = new AList();
		int[] ini = {10};
		pp.init(ini);
		pp.addEnd(5);
		assertEquals(2, pp.size());
		assertEquals(5, pp.get(pp.size()-1));
		int [] exp={10,5};
		int [] act=pp.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_0()
	{
		AList pp = new AList();
		int[] ini = {};
		pp.init(ini);
		pp.addEnd(5);
		assertEquals(1, pp.size());
		assertEquals(5, pp.get(pp.size()-1));
		int [] exp={5};
		int [] act=pp.toArray();
		assertArrayEquals(exp, act);
	}
	//=============================================================
	@Test
	public void testAddStart_many()
	{
		AList pp = new AList();
		int[] ini = {10,20,33,55,12,45};
		pp.init(ini);
		pp.addStart(5);
		assertEquals(7, pp.size());
		assertEquals(5, pp.get(0));
		int [] exp={5,10,20,33,55,12,45};
		int [] act=pp.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_2()
	{
		AList pp = new AList();
		int[] ini = {10,20};
		pp.init(ini);
		pp.addStart(5);
		assertEquals(3, pp.size());
		assertEquals(5, pp.get(0));
		int [] exp={5,10,20};
		int [] act=pp.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_1()
	{
		AList pp = new AList();
		int[] ini = {10};
		pp.init(ini);
		pp.addStart(5);
		assertEquals(2, pp.size());
		assertEquals(5, pp.get(0));
		int [] exp={5,10};
		int [] act=pp.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_0()
	{
		AList pp = new AList();
		int[] ini = {};
		pp.init(ini);
		pp.addStart(5);
		assertEquals(1, pp.size());
		assertEquals(5, pp.get(0));
		int [] exp={5};
		int [] act=pp.toArray();
		assertArrayEquals(exp, act);
	}
	//=============================================================
	
	@Test
	public void testAddPos_many() {
		AList pp = new AList();
		int[] ini = {10,20,25,45};
		pp.init(ini);
		pp.addPos(2, 5);
		assertEquals(5, pp.size());
		assertEquals(5, pp.get(2));
		int [] exp = {10,20,5,25,45};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testAddPos_2() {
		AList pp = new AList();
		int[] ini = {10,20};
		pp.init(ini);
		pp.addPos(2, 5);
		assertEquals(3, pp.size());
		assertEquals(5, pp.get(2));
		int [] exp = {10,20,5};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testAddPos_1() {
		AList pp = new AList();
		int[] ini = {10};
		pp.init(ini);
		pp.addPos(2, 5);
		assertEquals(3, pp.size());
		assertEquals(5, pp.get(2));
		int [] exp = {10,0,5};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testAddPos_0() {
		AList pp = new AList();
		int[] ini = {10};
		pp.init(ini);
		pp.addPos(0, 5);
		assertEquals(2, pp.size());
		assertEquals(5, pp.get(0));
		int [] exp = {5,10};
		assertArrayEquals(exp, pp.toArray());
	}
	
	
//=============================================================
	@Test
	public void testDelStart_many() {
		AList pp = new AList();
		int[] ini ={10,20,30,45};
		pp.init(ini);
		pp.delStart();
		assertEquals(3, pp.size());
		assertEquals(20, pp.get(0));
		int [] exp={20,30,45};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testDelStart_2() {
		AList pp = new AList();
		int[] ini ={10,20};
		pp.init(ini);
		pp.delStart();
		assertEquals(1, pp.size());
		assertEquals(20, pp.get(0));
		int [] exp={20};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testDelStart_1() {
		AList pp = new AList();
		int[] ini ={10};
		pp.init(ini);
		pp.delStart();
		assertEquals(0, pp.size());
		assertEquals(0, pp.get(0));
		int [] exp={};
		assertArrayEquals(exp, pp.toArray());
	}
//	public void testDelStart_0() {
//		AList pp = new AList();
//		int[] ini ={};
//		pp.init(ini);
//		pp.delStart();
//		assertEquals(0, pp.size());
//		assertEquals(0, pp.get(0));
//		int [] exp={};
//		assertArrayEquals(exp, pp.toArray());
//	}
	
	//===========================================================
	@Test
	public void testDelEnd_many() {
		AList pp = new AList();
		int[] ini = {10,20,30,45};
		pp.init(ini);
		pp.delEnd();
		assertEquals(3, pp.size());
		assertEquals(30, pp.get(pp.size()-1));
		int[] exp = {10,20,30};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testDelEnd_1() {
		AList pp = new AList();
		int[] ini = {10};
		pp.init(ini);
		pp.delEnd();
		assertEquals(0, pp.size());
//		assertEquals(0, pp.get(0));
		int[] exp = {};
		assertArrayEquals(exp, pp.toArray());
	}
//	@Test
//	public void testDelEnd_0() {
//		AList pp = new AList();
//		int[] ini = {};
//		pp.init(ini);
//		pp.delEnd();
//		assertEquals(0, pp.size());
//		assertEquals(0, pp.get(0));
//		int[] exp = {};
//		assertArrayEquals(exp, pp.toArray());
//	}
//===============================================================
	
	@Test
	public void testDelPos_Many() {
		AList pp = new AList();
		int[] ini = {10,20,30,45};
		pp.init(ini);
		pp.delPos(2);
		assertEquals(3, pp.size());
		assertEquals(45, pp.get(2));
		int[] exp = {10,20,45};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testDelPos_2() {
		AList pp = new AList();
		int[] ini = {10,20};
		pp.init(ini);
		pp.delPos(0);
		assertEquals(1, pp.size());
		assertEquals(20, pp.get(0));
		int[] exp = {20};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testDelPos_1() {
		AList pp = new AList();
		int[] ini = {100};
		pp.init(ini);
		pp.delPos(0);
		assertEquals(0, pp.size());
		assertEquals(0, pp.get(0));
		int[] exp = {};
		assertArrayEquals(exp, pp.toArray());
	}
//	@Test
//	public void testDelPos_PosMoreCount() {
//		AList pp = new AList();
//		int[] ini = {100};
//		pp.init(ini);
//		pp.delPos(2);
//		assertEquals(0, pp.size());
//		assertEquals(0, pp.get(0));
//		int[] exp = {};
//		assertArrayEquals(exp, pp.toArray());
//	}
//	@Test
//	public void testDelPos_nullArray() {
//		AList pp = new AList();
//		int[] ini = {};
//		pp.init(ini);
//		pp.delPos(2);
//		assertEquals(0, pp.size());
//		assertEquals(0, pp.get(0));
//		int[] exp = {};
//		assertArrayEquals(exp, pp.toArray());
//	}
//================================================================
	@Test
	public void testSize_Many() {
		AList pp = new AList();
		int[] ini= {10,20,30,45};
		pp.init(ini);
		assertEquals(4, pp.size());
	}
	@Test
	public void testSize_1() {
		AList pp = new AList();
		int[] ini= {10};
		pp.init(ini);
		assertEquals(1, pp.size());
	}
	@Test
	public void testSize_0() {
		AList pp = new AList();
		int[] ini= {};
		pp.init(ini);
		assertEquals(0, pp.size());
	}
//==============================================================
	@Test
	public void testSort_Many() {
		AList pp = new AList();
		int[] ini = {10,55,20,11,13};
		pp.init(ini);
		pp.sort();
		int[] exp = {10,11,13,20,55};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testSort_2() {
		AList pp = new AList();
		int[] ini = {10,1};
		pp.init(ini);
		pp.sort();
		int[] exp = {1,10};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testSort_1() {
		AList pp = new AList();
		int[] ini = {10};
		pp.init(ini);
		pp.sort();
		int[] exp = {10};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testSort_0() {
		AList pp = new AList();
		int[] ini = {};
		pp.init(ini);
		pp.sort();
		int[] exp = {};
		assertArrayEquals(exp, pp.toArray());
	}
//============================================================
	@Test
	public void testReverse2_Many() {
		AList pp = new AList();
		int[] ini = {10,55,20,11,13};
		pp.init(ini);
		pp.reverse2();
		int[] exp = {13,11,20,55,10};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testReverse2_2() {
		AList pp = new AList();
		int[] ini = {10,55};
		pp.init(ini);
		pp.reverse2();
		int[] exp = {55,10};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testReverse2_1() {
		AList pp = new AList();
		int[] ini = {10};
		pp.init(ini);
		pp.reverse2();
		int[] exp = {10};
		assertArrayEquals(exp, pp.toArray());
	}
	@Test
	public void testReverse2_0() {
		AList pp = new AList();
		int[] ini = {};
		pp.init(ini);
		pp.reverse2();
		int[] exp = {};
		assertArrayEquals(exp, pp.toArray());
	}
//============================================================
//	@Test
//	public void testReverse() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testReverse2() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testToArray() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testInit() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMax() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMin() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMaxInd() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMinInd() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testClear() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}

}
