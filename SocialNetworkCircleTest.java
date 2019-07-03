package circularOrbit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import myException.FileChooseException;

class SocialNetworkCircleTest {

	SocialNetworkCircle sn = new SocialNetworkCircle();
	
	@Test
	public void readFileAndCreateSystemTest() throws IOException, FileChooseException {
		File SocialNetworkCircleFile = new File("");
		SocialNetworkCircleFile = new File("src/Spring2019_HITCS_SC_Lab3-master/SocialNetworkCircle.txt");
		sn.readFileAndCreateSystem(SocialNetworkCircleFile);
		assertEquals(3, sn.getTrack(1).getNumberOfObjects());
		assertEquals(1, sn.getTrack(2).getNumberOfObjects());
		//assertTrue(sn.getTrack(1).contains());
		//assertEquals("[name=TommyWong, age=30]",sn.getCentralObject());
		assertEquals(0.4965784284662087,sn.getSystemEntropy());
	}
}
