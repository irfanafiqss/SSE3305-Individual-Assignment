package sem12122.sse3305.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PensionServiceIMPTest {

	@Test
	void testCase1() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("21");
		userDetails.add("1");
		userDetails.add("1956");
		userDetails.add("31");
		userDetails.add("3");
		userDetails.add("1991");
		userDetails.add("500.0");//gaji minima
		userDetails.add("200");
		userDetails.add("100");
		userDetails.add("0");
		userDetails.add("0");
		userDetails.add("0");
		userDetails.add("31");
		userDetails.add("3");
		userDetails.add("2002");
		userDetails.add("P");
		userDetails.add("N");
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double expPension = 110.0;
		double expGratuity = 4950.0;
		double expCashAward = 2333.33;
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(2, actRetireMonth);
		assertEquals(46, actRetireYear);
		assertEquals("0", tiadaganjaran);
		assertEquals(132, totalMonth);
		assertEquals(expPension,actPension);
		assertEquals(expGratuity,actGratuity);
		assertEquals(expCashAward,actCash);
		
	}

	@Test
	void testCase2() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("21");
		userDetails.add("1");
		userDetails.add("1953");
		userDetails.add("31");
		userDetails.add("3");
		userDetails.add("1991");
		userDetails.add("6000.0");
		userDetails.add("200");
		userDetails.add("100");
		userDetails.add("0");
		userDetails.add("0");
		userDetails.add("0");
		userDetails.add("31");
		userDetails.add("3");
		userDetails.add("1999");
		userDetails.add("P");
		userDetails.add("Y");
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		String dateRetire = output.get(7);
		
		assertEquals(2, actRetireMonth);
		assertEquals(46, actRetireYear);
		assertEquals("2", tiadaganjaran);
		assertEquals(96, totalMonth);
		
	}
	
	@Test
	void testCase3() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("31");
		userDetails.add("10");
		userDetails.add("1967");
		userDetails.add("20");
		userDetails.add("3");
		userDetails.add("1991");
		userDetails.add("6000");
		userDetails.add("200");
		userDetails.add("100");
		userDetails.add("0");
		userDetails.add("0");
		userDetails.add("0");
		userDetails.add("20");
		userDetails.add("3");
		userDetails.add("2003");
		userDetails.add("P");
		userDetails.add("Y");
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		String dateRetire = output.get(7);
		
		assertEquals(4, actRetireMonth);
		assertEquals(35, actRetireYear);
		assertEquals("1", tiadaganjaran);
		assertEquals(144, totalMonth);
		
	}
	
	@Test
	void testCase4() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("31");
		userDetails.add("1");
		userDetails.add("1956");
		userDetails.add("1");
		userDetails.add("3");
		userDetails.add("1991");
		userDetails.add("6000");
		userDetails.add("200");
		userDetails.add("100");
		userDetails.add("0");
		userDetails.add("0");
		userDetails.add("0");
		userDetails.add("1");
		userDetails.add("3");
		userDetails.add("2002");
		userDetails.add("L");
		userDetails.add("Y");
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double expPension = 1320.0;
		double expGratuity = 59400.0;
		double expCashAward = 20666.67;
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		assertEquals(expPension,actPension);
		assertEquals(expGratuity,actGratuity);
		assertEquals(expCashAward,actCash);
		
	}
	
	@Test
	void testCase5() {
		PensionServiceIMP service = new PensionServiceIMP();
		
		ArrayList<String> pensionInput = new ArrayList<String>();
		pensionInput.add("21");
		pensionInput.add("1");
		pensionInput.add("1953");
		pensionInput.add("31");
		pensionInput.add("3");
		pensionInput.add("1991");
		pensionInput.add("6000");
		pensionInput.add("200");
		pensionInput.add("100");
		pensionInput.add("0");
		pensionInput.add("0");
		pensionInput.add("0");
		pensionInput.add("31");
		pensionInput.add("3");
		pensionInput.add("1999");
		pensionInput.add("L");
		pensionInput.add("Y");
		
		ArrayList<String> output = service.kirapencen(pensionInput);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		String dateRetire = output.get(7);
		
		assertEquals(2, actRetireMonth);
		assertEquals(46, actRetireYear);
		assertEquals("2", tiadaganjaran);
		assertEquals(96, totalMonth);
		
		
	}
	
	@Test
	void testCase6() {
		PensionServiceIMP service = new PensionServiceIMP();
		
		ArrayList<String> pensionInput = new ArrayList<String>();
		pensionInput.add("31");
		pensionInput.add("10");
		pensionInput.add("1962");
		pensionInput.add("31");
		pensionInput.add("3");
		pensionInput.add("1991");
		pensionInput.add("6000");
		pensionInput.add("200");
		pensionInput.add("100");
		pensionInput.add("0");
		pensionInput.add("0");
		pensionInput.add("0");
		pensionInput.add("31");
		pensionInput.add("3");
		pensionInput.add("1998");
		pensionInput.add("L"); 
		pensionInput.add("Y");
		
		ArrayList<String> output = service.kirapencen(pensionInput);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		String dateRetire = output.get(7);
		
		assertEquals(5, actRetireMonth);
		assertEquals(35, actRetireYear);
		assertEquals("1", tiadaganjaran);
		assertEquals(84, totalMonth);
		
		
	}
	
	@Test
	void testCase7() {
		PensionServiceIMP service = new PensionServiceIMP();
		
		ArrayList<String> pensionInput = new ArrayList<String>();
		pensionInput.add("21");
		pensionInput.add("1");
		pensionInput.add("1972");
		pensionInput.add("31");
		pensionInput.add("10");
		pensionInput.add("1990");
		pensionInput.add("6000");
		pensionInput.add("200");
		pensionInput.add("160");//cuti 160 hari
		pensionInput.add("0");
		pensionInput.add("0");
		pensionInput.add("0");
		pensionInput.add("20");
		pensionInput.add("3");
		pensionInput.add("2025");
		pensionInput.add("L");
		pensionInput.add("N");
		
		ArrayList<String> output = service.kirapencen(pensionInput);
		double expPension =3600.0;
		double expGratuity = 185400.0;
		double expCash = 31000.0;//patutnya 33066.67
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(1, actRetireMonth);
		assertEquals(53, actRetireYear);
		assertEquals("0", tiadaganjaran);
		assertEquals(412, totalMonth);
		assertEquals(expPension,actPension);
		assertEquals(expGratuity,actGratuity);
		assertEquals(expCash,actCash);
		
		
	}
	
	@Test
	void testCase8() {
		PensionServiceIMP service = new PensionServiceIMP();
		
		ArrayList<String> pensionInput = new ArrayList<String>();
		pensionInput.add("21");
		pensionInput.add("1");
		pensionInput.add("1947");
		pensionInput.add("31");
		pensionInput.add("3");
		pensionInput.add("1991");
		pensionInput.add("6000");
		pensionInput.add("200");
		pensionInput.add("100");
		pensionInput.add("0");
		pensionInput.add("0");
		pensionInput.add("0");
		pensionInput.add("31");
		pensionInput.add("3");
		pensionInput.add("1999");
		pensionInput.add("L");
		pensionInput.add("N");
		
		ArrayList<String> output = service.kirapencen(pensionInput);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(2, actRetireMonth);
		assertEquals(52, actRetireYear);
		assertEquals("2", tiadaganjaran);
		assertEquals(96, totalMonth);
		
		
	}
	
	@Test
	void testCase9() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("21");//haribulan lahir
		userDetails.add("1");//bulan lahir
		userDetails.add("1968");//tahun lahir
		userDetails.add("31");
		userDetails.add("3");
		userDetails.add("1991");//tahun kerja
		userDetails.add("6000");//gaji
		userDetails.add("200");//allowance
		userDetails.add("100");//gajihharicuti
		userDetails.add("0");//cutihari
		userDetails.add("0");//cutibulan
		userDetails.add("0");//cutitahun
		userDetails.add("31");//harisara
		userDetails.add("3");//bulansara
		userDetails.add("2003");//tahunsara
		userDetails.add("L");//jantina
		userDetails.add("N");//istimewa
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(2, actRetireMonth);
		assertEquals(35, actRetireYear);
		assertEquals("1", tiadaganjaran);
		assertEquals(144, totalMonth);
	}
	
	@Test
	void testCase10() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("21");//haribulan lahir
		userDetails.add("1");//bulan lahir
		userDetails.add("1945");//tahun lahir
		userDetails.add("24");
		userDetails.add("4");
		userDetails.add("1991");//tahun kerja
		userDetails.add("6000");//gaji
		userDetails.add("200");//allowance
		userDetails.add("100");//gajihharicuti
		userDetails.add("0");//cutihari
		userDetails.add("0");//cutibulan
		userDetails.add("0");//cutitahun
		userDetails.add("24");//harisara
		userDetails.add("4");//bulansara
		userDetails.add("2002");//tahunsara
		userDetails.add("P");//jantina
		userDetails.add("N");//istimewa
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double expPension = 1320.0;
		double expGratuity = 59400.0;
		double expCashAward = 20666.67;
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(3, actRetireMonth);
		assertEquals(57, actRetireYear);
		assertEquals("0", tiadaganjaran);
		assertEquals(132, totalMonth);
		assertEquals(expPension,actPension);
		assertEquals(expGratuity,actGratuity);
		assertEquals(expCashAward,actCash);
	}
	
	@Test
	void testCase11() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("21");//haribulan lahir
		userDetails.add("1");//bulan lahir
		userDetails.add("1953");//tahun lahir
		userDetails.add("24");
		userDetails.add("4");
		userDetails.add("1991");//tahun kerja
		userDetails.add("6000");//gaji
		userDetails.add("200");//allowance
		userDetails.add("100");//gajihharicuti
		userDetails.add("0");//cutihari
		userDetails.add("0");//cutibulan
		userDetails.add("0");//cutitahun
		userDetails.add("24");//harisara
		userDetails.add("4");//bulansara
		userDetails.add("1999");//tahunsara
		userDetails.add("L");//jantina
		userDetails.add("N");//istimewa
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(3, actRetireMonth);
		assertEquals(46, actRetireYear);
		assertEquals("2", tiadaganjaran);
		assertEquals(96, totalMonth);
	}
	
	@Test
	void testCase12() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("21");//haribulan lahir
		userDetails.add("1");//bulan lahir
		userDetails.add("1968");//tahun lahir
		userDetails.add("24");
		userDetails.add("4");
		userDetails.add("1991");//tahun kerja 
		userDetails.add("6000");//gaji
		userDetails.add("200");//allowance
		userDetails.add("100");//gajihharicuti
		userDetails.add("0");//cutihari
		userDetails.add("0");//cutibulan
		userDetails.add("0");//cutitahun
		userDetails.add("24");//harisara
		userDetails.add("4");//bulansara
		userDetails.add("2003");//tahunsara
		userDetails.add("L");//jantina
		userDetails.add("Y");//istimewa
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(3, actRetireMonth);
		assertEquals(35, actRetireYear);
		assertEquals("1", tiadaganjaran);
		assertEquals(144, totalMonth);
	}
	
	@Test
	void BVA_testCase13_1() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("21");//haribulan lahir
		userDetails.add("1");//bulan lahir
		userDetails.add("1963");//tahun lahir
		userDetails.add("31");
		userDetails.add("3");
		userDetails.add("1991");//tahun kerja 
		userDetails.add("6000");//gaji
		userDetails.add("200");//allowance
		userDetails.add("100");//gajihharicuti
		userDetails.add("0");//cutihari
		userDetails.add("0");//cutibulan
		userDetails.add("0");//cutitahun
		userDetails.add("31");//harisara
		userDetails.add("3");//bulansara
		userDetails.add("2002");//tahunsara
		userDetails.add("L");//jantina
		userDetails.add("Y");//istimewa
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(2, actRetireMonth);
		assertEquals(39, actRetireYear);
		assertEquals("1", tiadaganjaran);
		assertEquals(132, totalMonth);
	}
	
	@Test
	void BVA_testCase13_2() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("21");//haribulan lahir
		userDetails.add("1");//bulan lahir
		userDetails.add("1962");//tahun lahir
		userDetails.add("31");
		userDetails.add("3");
		userDetails.add("1991");//tahun kerja 
		userDetails.add("6000");//gaji
		userDetails.add("200");//allowance
		userDetails.add("100");//gajihharicuti
		userDetails.add("0");//cutihari
		userDetails.add("0");//cutibulan
		userDetails.add("0");//cutitahun
		userDetails.add("31");//harisara
		userDetails.add("3");//bulansara
		userDetails.add("2002");//tahunsara
		userDetails.add("L");//jantina
		userDetails.add("Y");//istimewa
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(2, actRetireMonth);
		assertEquals(40, actRetireYear);
		assertEquals("0", tiadaganjaran);
		assertEquals(132, totalMonth);
	}

	@Test
	void BVA_testCase13_3() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("21");//haribulan lahir
		userDetails.add("1");//bulan lahir
		userDetails.add("1961");//tahun lahir
		userDetails.add("31");
		userDetails.add("3");
		userDetails.add("1991");//tahun kerja 
		userDetails.add("6000");//gaji
		userDetails.add("200");//allowance
		userDetails.add("100");//gajihharicuti
		userDetails.add("0");//cutihari
		userDetails.add("0");//cutibulan
		userDetails.add("0");//cutitahun
		userDetails.add("31");//harisara
		userDetails.add("3");//bulansara
		userDetails.add("2002");//tahunsara
		userDetails.add("L");//jantina
		userDetails.add("Y");//istimewa
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(2, actRetireMonth);
		assertEquals(41, actRetireYear);
		assertEquals("0", tiadaganjaran);
		assertEquals(132, totalMonth);
	}
	
	@Test
	void BVA_testCase14_1() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("21");//haribulan lahir
		userDetails.add("1");//bulan lahir
		userDetails.add("1955");//tahun lahir
		userDetails.add("31");
		userDetails.add("3");
		userDetails.add("1991");//tahun kerja 
		userDetails.add("6000");//gaji
		userDetails.add("200");//allowance
		userDetails.add("100");//gajihharicuti
		userDetails.add("0");//cutihari
		userDetails.add("0");//cutibulan
		userDetails.add("0");//cutitahun
		userDetails.add("1");//harisara
		userDetails.add("3");//bulansara
		userDetails.add("2001");//tahunsara
		userDetails.add("P");//jantina
		userDetails.add("N");//istimewa
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(1, actRetireMonth);
		assertEquals(46, actRetireYear);
		assertEquals("2", tiadaganjaran);
		assertEquals(119, totalMonth);
	}
	
	@Test
	void BVA_testCase14_2() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("21");//haribulan lahir
		userDetails.add("1");//bulan lahir
		userDetails.add("1955");//tahun lahir
		userDetails.add("31");
		userDetails.add("3");
		userDetails.add("1991");//tahun kerja 
		userDetails.add("6000");//gaji
		userDetails.add("200");//allowance
		userDetails.add("100");//gajihharicuti
		userDetails.add("0");//cutihari
		userDetails.add("0");//cutibulan
		userDetails.add("0");//cutitahun
		userDetails.add("1");//harisara
		userDetails.add("4");//bulansara
		userDetails.add("2001");//tahunsara
		userDetails.add("P");//jantina
		userDetails.add("N");//istimewa
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(2, actRetireMonth);
		assertEquals(46, actRetireYear);
		assertEquals("0", tiadaganjaran);//sepatutnya "2"
		assertEquals(120, totalMonth);
	}
	
	@Test
	void BVA_testCase14_3() {
		PensionServiceIMP penCalc = new PensionServiceIMP();
		ArrayList<String> userDetails = new ArrayList<String>();
		userDetails.add("21");//haribulan lahir
		userDetails.add("1");//bulan lahir
		userDetails.add("1955");//tahun lahir
		userDetails.add("31");
		userDetails.add("3");
		userDetails.add("1991");//tahun kerja 
		userDetails.add("6000");//gaji
		userDetails.add("200");//allowance
		userDetails.add("100");//gajihharicuti
		userDetails.add("0");//cutihari
		userDetails.add("0");//cutibulan
		userDetails.add("0");//cutitahun
		userDetails.add("1");//harisara
		userDetails.add("5");//bulansara
		userDetails.add("2001");//tahunsara
		userDetails.add("P");//jantina
		userDetails.add("N");//istimewa
		
		ArrayList<String> output = penCalc.kirapencen(userDetails);
		double actRetireMonth = Double.parseDouble(output.get(0));
		double actRetireYear = Double.parseDouble(output.get(1));
		String tiadaganjaran = output.get(2);
		double totalMonth = Double.parseDouble(output.get(3));
		double actPension = Double.parseDouble(output.get(4));
		double actGratuity = Double.parseDouble(output.get(5));
		double actCash = Double.parseDouble(output.get(6));
		
		assertEquals(3, actRetireMonth);
		assertEquals(46, actRetireYear);
		assertEquals("0", tiadaganjaran);
		assertEquals(121, totalMonth);
	}
}
