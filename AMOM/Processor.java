
import java.util.ArrayList;
public class Processor {
int x;
int y;
Location2[][] world = new Location2[9][6];
ArrayList<Items> myInventory = new ArrayList<Items>();
ArrayList<String> nameInventory = new ArrayList<String>();

	public Processor() {

		ArrayList<Items> bunkItems = new ArrayList<Items>();
		ArrayList<Items> campItems = new ArrayList<Items>();
		ArrayList<Items> labItems = new ArrayList<Items>();
		ArrayList<Items> innercaveItems = new ArrayList<Items>();
		ArrayList<Items> nothing = new ArrayList<Items>();
		ArrayList<Items> chasmItems = new ArrayList<Items>();

		labItems.add(new Items("microscope", "null"));
		campItems.add(new Items("shovel", "A tool used for digging"));
		campItems.add(new Items("dynamite", "There's really no reason you should have this, but you never know..."));
		chasmItems.add(new Items("beacon", "You will need this to get help from the mainland."));
		bunkItems.add(new Items("notebook", "An old leartherboud journal that you should use whenever something important happens."));
		innercaveItems.add(new Items("stone", "It's a strange green stone carved into the shape of a six pointed star, you should bring this to lab and look at it under the microscope."));
		innercaveItems.add(new Items("note", "it reads: MAJOR DISCOVER! BODIES OF NINE LIFE-FORMS OF UNKNOWN ORIGIN FOUND WITHIN THE CAVE.\n SPECIMENS BROUGHT TO ZETABASE.\n WARNING: RADIOS STILL AREN'T WORKING. ALPHA TEAM MISSING WITH THE BEACON."));
		nothing.add(new Items("null", "null"));
		x = 4;
		y = 5;


		world[0][0] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[0][1] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[0][2] = new Location2("You are now inside the ZetaBase compound, and things dont look too good.", "things are much worse inside, the torn bodies of the second research team are strewn about the floor.", nothing);
		world[0][3] = new Location2("You have entered ZetaBase", "This is the second research team's camp. blood is all over the ground and debris from the camp has been tossed about. there's also a strange formation on the ground nearby it looks deserted.", nothing);
		world[0][4] = new Location2("You are just outside of ZetaBase", "there is formation just a few feet away from the base proper. someone or something has drawn a six pointed star in the ground, and at each point of the star is a tiny mound, as if something has been burried.", nothing);
		world[0][5] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[1][0] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[1][1] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[1][2] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[1][3] = new Location2("You are on the WestPath", "its cold out", nothing);
		world[1][4] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[1][5] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[2][0] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[2][1] = new Location2("You have entered the cave camp", "Among the boxes and collections are a shovel, a flashlight, and even few sticks of dynamite! you'll need the first two things, but the dynamite... That's up to you.", campItems);
		world[2][2] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);//
		world[2][2] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[2][3] = new Location2("You are on the WestPath","blah", nothing);
		world[2][4] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[2][5] = new Location2("You have entered the lab", "The lab contains a microscope that you will need to use to examine any samples that you find.\nIf you havent found anything interesting yet, go back outside and go to the cave east of the base.", labItems);
		world[3][0] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[3][1] = new Location2("You are at the mouth of the cave", "to the east is the mouth of the cave, and to the west is Zeta's excavation camp. you should grab some tools from there.", nothing);
		world[3][2] = new Location2("You are on the SouthPath", "its very cold out, keep moving.", nothing);
		world[3][3] = new Location2("You are at the center of the map, where would you like to go?", "Going south will take you to the cave, going west will take you to ZetaBase, going East will take you to the Airfield, and going North will take you to AlphaBase.", nothing);
		world[3][4] = new Location2("You are on NorthPath", "its very cold out, keep moving.", nothing);
		world[3][5] = new Location2("You are currently in AlphaBase", "This is you'r teams base of research in the Antarctic. two the west is the lab, and the exit is to the south of you.", nothing);
		world[4][0] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[4][1] = new Location2("You are inside the cave", "You should start digging here, but first, there appears to be a note on the ground.", innercaveItems);
		world[4][2] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[4][3] = new Location2("You have entered the airfield", "The planes have been sabataged! the fuel tanks have been emptied, and even parts of the motor have been disassembled. Fortunately for you, whoever or whatever did this left a trail of some kind, leading to the east.", nothing);
		world[4][4] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[4][5] = new Location2("you are currently in the sleeping quarters", "Your job today is to go out and collect samples from a southern ice cave team Zeta found yesterday. the door is to the west of you.", bunkItems);
		world[5][0] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[5][1] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[5][2] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[5][3] = new Location2("You see a high mountain range in the distance, keep going.", "nothing but frozen tundra", nothing);
		world[5][4] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);//
		world[5][5] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[6][0] = new Location2("You have reached a massive chasm whose entrance is to the east of you.", "you can see enough", nothing);
		world[6][1] = new Location2("Deciphering any hyirolgphys you've seen so far is impossible. but from the mural and carvings on the walls weave a story rich in the history of these powerful creatures that once called this place home. They came filtering down from cosmic infinity, and used unknown principles of chemistry and biology to seed the planet with life.", "why arent you taking notes?!", nothing);
		world[6][2] = new Location2("fear and curiosity collide in equal measure as you explore the ruins. beneath the shadows of the great towers, you are surrounded by structures and shapes so bizare they seem to defy all laws of mathmatics and geometry. Further more, massive relief sculpltures and murals decorate nearly every wall of this forgotten, alien metropolis.", "why arent you taking notes?!", nothing);
		world[6][3] = new Location2("for several more miles you stumble through the snow, and eventually the rocky terrain of the mountains, you find a pass, and continue through it until you find an increadble sight beyond it! the ruins of a massive city!", "the only way you can go is south", nothing);
		world[6][4] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[6][5] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[7][0] = new Location2("You have entered the chasm, and immediately something is wrong.", "As you stumble through the dark you catch a whiff of something rancid, until you come to a heap of dead bodies. The remains of Alpha Team! the beacon is laying in the center.", chasmItems);
		world[7][1] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);//
		world[7][3] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);//
		world[7][4] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[7][5] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[8][0] = new Location2("Something horrible is emerging from the darkness! Your scream in terror as three tentecaled monsters scuttle towards you, there arms and teeth stained with the blood of your friends! Use a weapon if you have one, quick!", "NO TIME! the monsters are coming at you!", nothing);
		world[8][1] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[8][2] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[8][3] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[8][4] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);
		world[8][5] = new Location2("You can't go this way, turn back immediately", "You need to turn around", nothing);

		//item (name, description, use)
	}
	

	public String processCommand(String command) {
		//parse the command into its words (split)
		String[] words = parseCommand(command);

		// determine action to take based on the words
		String action = performAction(words);

	
		return action;
		
	}

	public String[] parseCommand(String command) {
		return command.split(" ");
	}

	public String performAction(String[] words) {
			String s = "";	
///////////////MOVING AROUND///////////////////////////////////////////
	if (words[0].equals("go")) {

			if (words[1].equals("north")) {
				if (y+1 <= 5 ) {
				y++;
				}s = world[x][y].getName();
			}
			

			if (words[1].equals("south")) {
				if (y-1 >= 0 ) {
				y--;
				}s = world[x][y].getName();
			}
			

			if (words[1].equals("east")) {
				if (x+1 <= 8 ) {
				x++;
				}s = world[x][y].getName();
			}
				
			if (words[1].equals("west")) {
				if (x-1 >= 0 ) {
				x--;
				}s = world[x][y].getName();
			}
		}

/////////////////////////LOOKING AROUND////////////////////////////////////////////////////
	else if (words[0].equals("look") && words[1].equals("around")) {
			s = world[x][y].getDesc();
	}
///////////////////////Taking Items////////////////////////////////////////////////
	else if (words[0].equals("grab")) {
			if (words[1].equals("shovel")) {
			if(x == 2 && y == 1){
			myInventory.add(world[x][y].getItemOne());
			nameInventory.add("shovel");
			s = "you picked up a shovel.";} 	
		}
		
			if (words[1].equals("notebook")) {
			if(x == 4 && y == 5){
			myInventory.add(world[x][y].getItemOne());
			nameInventory.add("notebook");
			s = "you picked up a notebook.";}
			else{ s = "nope";}
		} 

			if (words[1].equals("note")) {
				if(x == 4 && y == 1) {
			myInventory.add(world[x][y].getItemTwo());
			nameInventory.add("note");
			s = "you picked up a note.";}
			else{ s = "nope";}
		} 
	
			if (words[1].equals("dynamite")) {
				if(x == 2 && y == 1){
			myInventory.add(world[x][y].getItemTwo());
			nameInventory.add("dynamite");
			s = "you picked up dynamite.";}
			else{ s = "nope";}
		}
		
			if (words[1].equals("stone")) {
				if(x == 4 && y == 1){
			myInventory.add(world[x][y].getItemOne());
			nameInventory.add("stone");
			s = "you picked up a strange stone.";}
				else { s = "nope"; }
		}
			if (words[1].equals("beacon")) {
				if(x == 7 && y == 0){
			myInventory.add(world[x][y].getItemOne());
			nameInventory.add("beacon");
				s = "you picked up the beacon!";}
				else{ s = "nope";}
			}		
	}
	/////////////Useing Items///////////////////////////////////////////////////////////////
	else if (words[0].equals("use")) {
		if (words[1].equals("shovel")) {
			if(nameInventory.contains("shovel")){
			if( x == 4 && y == 1){
			s = "you have unearthed a strange looking stone!";
			}
			else if( x == 0 && y == 4){
			s = "Beneath one of the mounds is the corpse of some bizarre creature! its body is barrel shaped with stalk like legs and five tentecaled arms.";
			}
		}
		}

		if (words[1].equals("microscope")) {
			if( x == 2 && y == 5){
			s = "what you see beneath the microscope is intreging indeed. The fractual patterns of the stone don't match with any elemental structure you have seen before. Sadly, no other information can be gained from this observation.";
			}
			else{s = "shogoth got your tongue?";}
		}

		if (words[1].equals("dynamite")) {
			if(nameInventory.contains("dynamite")){
			if( x == 8 && y == 0){
			s = "you hurl the lit explosive at the monstrosity and run for it! the following explosion blasts slime like beast apart, and causes the chasm to callapse. you escape just in time! you WIN!!!";
			}
			}
			
		}

		if (words[1].equals("notebook")) {
			if(nameInventory.contains("notebook")){
			if((x == 6) || (x==4 && y==1) || (x == 0)) {
			s = "You make an important entry in your journal.";
			}
			else{s = "You draw a pointless doodle in your journal...";}
			}
			else{s = "shogoth got your tongue?";}
		}

		if (words[1].equals("beacon")){
			if(nameInventory.contains("beacon") && (x==7 && y==0)){
				s = "You have activated the beacon, help will be coming in a matter of days!, there's an exit to the chasm to the east.";
			}
		}
	}

	////////////////////////////Drop An Item////////////////////////////
		else if (words[0].equals("drop")){
			String someWord = words[1];
			if (words[1].equals(someWord)){
			myInventory.remove(someWord);
			nameInventory.remove(someWord);
			s = ("you dropped your" + " " + (someWord));}
		}
/////////////////EAMINE AN ITEM////////////////////////////////////////////////
		else if (words[0].equals("examine")){
			for (Items i : myInventory){
				if(words[1].equals(i.getItem())){
					s = i.examineItem();
				}
			}
			
			}
			return s;	
	}	}
		



	







	

					




