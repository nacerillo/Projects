/import java.util.*;

 public class Location {  
	 	private Map<String,List<String>> areas;
	 	

	 	public static String getDiscription(String loc) {
	 		//Alpha
		String base = ("The place is hardly enough room for the ten man expedition team. random boxes are scattered
		about, overflowing with reports, datafiles, measuring instroments, outdoor gear, and other junk. a tiny furnace roars in the corner.");
		String lab = ("You'll need to use the lab to examine any samples that you find, if you havent found anything interesting yet, it go back outside
			and go to the cave east of the base.");


		String cave = ("From the looks of the outside, it seemsthat Beta's research team has already entered the cave. A small encampment has been set up just outsid the opening, with an overhanging tarp, and a 
		an arrangment of digging and research instrumnets. before you enter, you mind want to go to the camp and grab some tools.");
		String camp = ();
		String innercave = ("The cave seems to strech on for miles. you go deeper and deeper into the blackness of the cave, hoping to find
		the second research team, but there nowhere to be found. they must be somewhere deeper in side. you would continue, but you've got samples to collect.
		time to put that geology degree to use, and start diggin, boy-o!");

		String beta = ("you've come to a gruesome sight. the snow and ice are stained with crimsons, the area has been
		ransacted, some of the supplies are missing. only a few feet away is some sort of starlike pattern on th ground
		you could investigate this, but you should go inside first to see if anyone is alive.");
		String inside = ("The scene is just as bad in the base, the blood and torn bodies of the second research team are strewn everywhere. but this isnt the doing
		of some animal, no. most of the wounds on there bodies are focused on the joints, throat, and face. what did this knew what it was doing. more terrifying still,
		however, is the fact that the limbs of those who have been dismembered are nowhere to be seen.");
		String outside = ("Now back to the strange formation on the ground outside. it is in the shape of a six pointed star, and at each point
		of the star the ground has been upturned, as if something was burried.");


		String airfield = ("Fortunetly for you, the planes are still in good condition dispite the ice and wind, and their should still be some gas 
		in the motor. get in there.");

		String city = ("through the clouds you see it. sitting within the great ring of mountains lays a vast, ancient city
		unlike anything you have ever seen. great spires of black stone, and cuboidal structures arranged in the most bizarre patterns 
		dot the valley below. What is this you wonder? who could have possibly built this city? Your curiousity has gotten the better of you. land the plane along a flat strectch of
		ice within the valley. you exit, and begin making your venture into the city.");

		String ruins1 = ("fear and curiosity collide in equal measure as you explore the ruins. The view from the air was overwhelming enough
		but down here, in the shadows of the great towers, you are surrounded by structures and shapes so bizare they seem to
		blasphemize all laws of mathmatics and geometry. Further more, massive relief sculpltures and murals decorate nearly every wall and 
		corner of this forgotten, alien metropolis.");

		String ruins2 = ("deciphering any hyirolgphys you've seen so far is impossible. but from the mural and carvings on the walls weave a story 
		rich in the history of these powerful creatures that once called this place home. They came filtering down from cosmic infinity, and used unknown
		principles of chemistry and biology to seed the planet with life. you are shocked by one image in particular. the image of a bipedal figure performing 
		a foolish dance. it was used not just as an entertaining baphoon, but as a source of food as well.");

		ruins3 = ("These ancient beings waged many wars against other alien races. includeing a race of horrifying, tentecaled
		humaniods that wanted to claim the planet as their own. they were eventually driven back, but soon. the denizens of this city were
		undone by another race, one that they created. not by man, but by something far more sinister.");

		String ruins4 = ("These creatures resemble the beasts described in the necronomicon. the Shogoths. they
		were living masses of black, viscus jelly that were used as slaves by the ancient race. for centures
		they had kept them pasified and controled, until the Shogoths broke free from the grip of their masters, and became self aware.
		the ancient ones stood no chance against the nearly indestructible Shogoths, and eventually, they were forced to flee the
		planet, or retreat into the oceans to built a new city. the murals end here.");

		String chasm = ("");
		String innerchasm = ("It is nearly pitch black inside. you wont be able to go anyfurther without a light.");
		String sanctum = (", one that you recognize, and three that you do not. one if the body of Charley Bates, one of the members from base2, and the 
		three others, the barrel like hulks of the unknown lifeforms. what could have killed them, you should take a closer look.");
		String escape = ("you hear a horrible piping, sloshing noise behind you. you turn around and see a formless black mass rushing towards
		you with hellish speed! now would be an excellent time to run, or, if you have any weapons, use them now!");
	}

	public Location() {

	//areas = new HashMap<String, List<Stings>>();
//	getDescription(loc);
	/*ArrayList<String> aL = new ArrayList<String>();

	 aL.add("innercave");
	 aL.add("camp");
	areas.put("cave", aL);

	 aL = new ArrayList<String>();
	 aL.add("lab");
	 aL.add("bunks");
	areas.put("alpha", aL);

	aL = new ArrayList<String>();
	al.add("plane");
	areas.put("airfield", aL);

	aL = new ArrayList<String>();
	aL.add("inside");
	aL.add("outside");
	areas.put("beta", aL);

	aL = new ArrayList<String>();
	aL.add("ruins1");
	aL.add("ruins2");
	aL.add("ruins3");
	aL.add("chasm");
	areas.put("city", aL);

	aL = new ArrayList<String>();
	aL.add("innerchasm");
	aL.add("sanctum");
	areas.put("chasm", aL);/**/



	
	}

}	
			
	