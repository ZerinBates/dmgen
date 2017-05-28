package dnd;

public class structGen {
	private String DownTheRoad[]={
			"WaysideInn","Encampment","Fellow Travelers","Bandits","Abandoned Structure","Settlement"	
			};
	private String Encampment[]={
			"Monsterous (Goblin, Orc, Gnoll, etc.)",
			"Military (1-33% Friendly, 34-66% Indifferent, 67-99% Hostile, 100% Roll Again)",
			"Merchant Caravan (Likely To Sell Goods To PCs. Has 1d4 Random Magic Items)",
			"Bandits",
			"Travelling Troupe or Carnival (Entertainers. May Or May Not Contain A Freak Show, Mobile Stage, Or Fortune Teller)",
			"Refugees"
	};
	private String abandond[]={
	"Keep/Watch Tower",
	"Wizard's Tower",
	"Church/Temple/Shrine",
	"Wayside Inn",
	"Asylum/Hospital",
	"Cemetery",
	"Old Mansion/Manor",
	"Farm/Plantation",
	"Trading Post",
	"empty field with nothing in it"
	};
	private String setleType[]={
		"Village pop size: "+20+((int)(Math.random()*980)),
		"Small Town pop size: "+1000+((int)(Math.random()*3000)),
		"Large Town pop size: "+4000+((int)(Math.random()*3000)),
		"Small City pop size: "+8000+((int)(Math.random()*3000)),
		"Large City",
		"Bustling Metropolis"
	};
	public String GenStruct(){
	String descript="";
	dice roadRole= new dice();
	roadRole.roll(DownTheRoad.length);
	descript+=DownTheRoad[roadRole.current]+" ";
	if (roadRole.current==1){
//type of encampment
		dice encampRole= new dice();
		encampRole.roll(Encampment.length);
		descript+=Encampment[encampRole.current];
	}else if (roadRole.current==4){
//abandond structure
		dice abandondRoll=new dice();
		abandondRoll.roll(abandond.length);
		descript+=abandond[abandondRoll.current]+" with a ";
		abandondRoll.roll(abandond.length);
		descript+=abandond[abandondRoll.current]+" next to it";	
		// add population check
		
	}else if(roadRole.current==5){
		
	}
	return descript;
	}
		/* 
			Type of Encampment (1d6)

			Type Of Abandoned Structure (1d10; Attitude Of Possible Inhabitants: 1-50% Friendly, 51-100% Unfriendly)

			Keep/Watch Tower
			Wizard's Tower
			Church/Temple/Shrine
			Wayside Inn
			Asylum/Hospital
			Cemetery
			Old Mansion/Manor
			Farm/Plantation
			Trading Post
			Roll Twice. Ignore Rolls Of 10.
			
			Type Of Settlement (1d6)
			Village
			Small Town
			Large Town
			Small City
			Large City
			Bustling Metropolis
			Distinguishing Physical Features Of The Settlement (1d10)
			Walled (Walls Surround The Settlement. 1-40% Wood; 41-90% Stone, 91-100% Other)
			Tightly Packed (The Structures Are Close Together)
			Built Into A Natural Structure (Cave, Mountainside, Waterfall, Etc.)
			Built On The Bones of Ruins (Built Upon A Previously Existing Settlement Or Structure)
			Spread Out (Structures Are Set Apart By Large Distances)
			Ramshackle (The Structures Are Little More Than Shacks, Huts, Lean-tos, Etc.)
			Finely Built (The Structures Are Well Made By Skilled Hands. 1-20% Wood; 21-40% Stone; 41-90% Mix; 91-100% Other)
			Near A Body of Water (River, Lake, Ocean, Etc.)
			Very Remote (Several Days Ride From Larger Settlements)
			Roll Twice. Ignore Rolls Of 10.

			Attitude Of The Population (1d4)
			Indifferent
			Friendly
			Hostile
			Suspicious

			Settlement Quirks (1d12)
			People Only Ever Come Out At Night.
			Most Residents Are Weary Of Outsiders
			Everyone Is Entirely Too Polite.
			There Are No (1-50% Children; 51-100% Elderly)
			The Streets Are Heavily Patrolled By Watch Or Militia,
			There Are An Abnormal Number Of Beggars
			There Appears To Be No Watch Or Militia Presence.
			The Population Is Very Fashionable.
			The Population Is Very Poor.
			The Settlement Is Entirely Made Up Of A Single Race
			The Settlement Is Made Up Of Bickering Clans Or Families.
			Roll Twice. Ignore Rolls Of 12.

			Unique Settlement Features (Roll Twice) (1d12)
			Magic Shop
			Alchemists' Shop
			Weapon/Armor Smith
			Gambling House
			Brothel
			Temple To An Obscure Deity
			Military Outpost
			Gladiatorial Arena (1-50% Legal; 31-100% Illegal)
			Wizard's Tower
			Large Mill/Refinery
			Bazaar/Open-Air Market
			Roll Twice Again! Ignore Rolls Of 12.

			Major Factions In The Settlement (1d10)
			Mages' Guild
			Thieves' Guild
			Assassins' Guild
			Military (1-50% Current Regime; 51-100% Rebels And Dissidents)
			Foreign Embassy (From Other Nations or Races)
			Artisans' Guild
			Religious Order (1-33% Good; 34-66% Evil, 67-100% Neutral)
			Cult Or Secret Society
			Monstrous Humanoids (Orcs, Goblinoids, Etc.)
			Roll Twice. Ignore Rolls Of 10.

			Type of Local Government (1d6)
			Council
			Elected Official
			Magocracy
			Theocracy
			Aristocracy
			Anarchy

			Conflict (1d12)
			A New Organization Has Arisen In The Settlement, Threatening Existing Factions (Roll Again On The Major Factions In The Settlement)
			Raids From An Outside Presence
			Plague/Illness
			Famine/Drought
			Impending Natural Disaster
			Impending Unnatural Disaster
			Serial Killer On The Loose
			Rash Of Kidnappings
			String Of Robberies/Muggings
			Rival Factions Are About To Go To War Within The Settlement
			Undead
			Roll Twice. Ignore Rolls of 12.
			Interesting Features/Structures In The Area (1d8)
			Ruins
			An Abandoned Temple
			A Cave System
			A Long Forgotten Tomb
			A Sylvan Glade
			An Abandoned Mine
			An Abandoned Keep/Fortress/Tower
			Roll Twice. Ignore Rolls of 8
			*/
}

