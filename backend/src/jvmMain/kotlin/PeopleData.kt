import dev.johnoreilly.common.remote.Assignment


// from https://ll.thespacedevs.com/2.2.0/astronaut/?format=json&in_space=true&is_human=true
val currentPeopleInSpace = listOf(
    Assignment(
        craft = "ISS",
        name = "Christopher Williams",
        personImageUrl ="https://thespacedevs-prod.nyc3.digitaloceanspaces.com/media/images/255bauto255d__image_thumbnail_20240305190450.jpeg",
        personBio = "Christopher Williams grew up in Potomac, Maryland and graduated from Stanford University in 2005 with a bachelor’s degree in physics and a doctorate in physics from MIT in 2012, where his research was in astrophysics. Williams is a board-certified medical physicist, completing his residency training at Harvard Medical School before joining the faculty as a clinical physicist and researcher. He most recently worked as a medical physicist in the Radiation Oncology Department at the Brigham and Women's Hospital and Dana-Farber Cancer Institute in Boston. He was the lead physicist for the Institute’s MRI-guided adaptive radiation therapy program. His research focused on developing image guidance techniques for cancer treatments.",
        nationality = "American",
    ),
    Assignment(
        craft = "ISS",
        name = "Sergey Kud-Sverchkov",
        personImageUrl = "https://thespacedevs-prod.nyc3.digitaloceanspaces.com/media/images/255bauto255d__image_thumbnail_20240305191157.jpeg",
        personBio = "Sergey Vladimirvich Kud-Sverchkov Is a Kazakh-Russian engineer and cosmonaut selected in 2010.",
        nationality = "Russian",
    ),
    Assignment(
        craft = "ISS",
        name = "Sergey Mikayev",
        personImageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Roscosmos_cosmonaut_Sergey_Mikaev_poses_for_a_portrait_at_NASA%27s_Johnson_Space_Center_%28jsc2024e077064_alt%29.jpg/960px-Roscosmos_cosmonaut_Sergey_Mikaev_poses_for_a_portrait_at_NASA%27s_Johnson_Space_Center_%28jsc2024e077064_alt%29.jpg",
        personBio = "Sergey Mikayev is a Russian cosmonaut affiliated with Roscosmos",
        nationality = "Russian",
    ),

    Assignment(
        craft = "ISS",
        name = "Jessica Meir",
        personImageUrl = "https://thespacedevs-prod.nyc3.digitaloceanspaces.com/media/images/jessica_meir_image_20200417064900.jpeg",
        personBio = "Jessica Ulrika Meir is Assistant Professor of Anesthesia at Harvard Medical School, Massachusetts General Hospital, Boston, following postdoctoral research in comparative physiology at the University of British Columbia. She has studied the diving physiology and behavior of emperor penguins in Antarctica, and the physiology of bar-headed geese, which are able to migrate over the Himalayas. In 2000, Meir graduated with a Master of Space Studies from the International Space University in Strasbourg, France. In September 2002, Meir served as an aquanaut on the NASA Extreme Environment Mission Operations 4 (NEEMO 4) crew. In June 2013 she was named an astronaut candidate by NASA, becoming one of the eight members of NASA Astronaut Group 21. She is from Caribou, Maine.",
        nationality = "American",
    ),
    Assignment(
        craft = "ISS",
        name = "Jack Hathaway",
        personImageUrl = "https://thespacedevs-prod.nyc3.digitaloceanspaces.com/media/images/jack_hathaway_image_20211206185407.jpg",
        personBio = "Jack Hathaway is a US Navy commander from Connecticut. He earned bachelors’ degrees in physics and history from the U.S. Naval Academy and completed graduate studies at Cranfield University in England and the U.S. Naval War College. A distinguished naval aviator, Hathaway flew and deployed with Navy’s Strike Fighter Squadron 14 aboard the USS Nimitz and Strike Fighter Squadron 136 aboard the USS Truman. He graduated from Empire Test Pilots’ School, supported the Joint Chiefs of Staff at the Pentagon, and was most recently assigned as the prospective executive officer for Strike Fighter Squadron 81. He has more than 2,500 flight hours in 30 types of aircraft, more than 500 carrier arrested landings, and flew 39 combat missions.",
        nationality = "American",
    ),
    Assignment(
        craft = "ISS",
        name = "Sophie Adenot",
        personImageUrl = "https://thespacedevs-prod.nyc3.digitaloceanspaces.com/media/images/sophie_adenot_image_20221123150954.jpg",
        personBio = "Between 2001 and 2003, Sophie studied engineering and graduated from ISAE-SUPAERO in Toulouse, France, where she specialised in spacecraft and aircraft flight dynamics. She then completed a Master of Science in human factors engineering at MIT – Massachusetts Institute of Technology in Boston, USA, in 2004.\\r\\nIn 2005, Sophie joined the French Air Force for her basic military training and initial flying training to become a helicopter pilot.  \\r\\n\\r\\nIn 2018, she graduated with honours as a helicopter test pilot from the Empire Test Pilots’ School in Boscombe Down, UK. She was awarded the Mac Kenna trophy and the Patuxtent Shield.\\r\\nBetween 2019 and 2022, Sophie worked as a helicopter experimental test pilot in Cazaux Flight Test Center with DGA (Direction Générale de l’Armement – the French Defence Procurement Agency). She has logged 3000 hours and flew on 22 different helicopter types. She also holds a military parachute license, a light aircraft pilot license and a glider pilot license.",
        nationality = "French",
    ),
    Assignment(
        craft = "ISS",
        name = "Andrei Fedyaev",
        personImageUrl = "https://thespacedevs-prod.nyc3.digitaloceanspaces.com/media/images/andrei_fedyaev_image_20230207203113.jpg",
        personBio = "Andrei Valerievich Fedyaev (Андрей Валерьевич Федяев) is a Russian cosmonaut. He was a military pilot prior to retiring from Air Force in 2013, and was selected as a cosmonaut in 2012. \\r\\n\\r\\nISS-69 expedition will be Fedyaev's first spaceflight.",
        nationality = "Russian",
    ),


    Assignment(
        craft = "Orion",
        name = "Reid Wiseman",
        personImageUrl = "https://www.nasa.gov/wp-content/uploads/2020/12/wiseman_chief_astronaut_0.jpg",
        personBio = "Reid Wiseman is a 27-year Navy veteran, a pilot, a father, an engineer, and a Baltimore native. He was selected as an astronaut by NASA in 2009 and served as Flight Engineer aboard the International Space Station for Expedition 41 from May through November of 2014. During the 165-day mission, Reid and his crewmates completed over 300 scientific experiments in areas such as human physiology, medicine, physical science, Earth science and astrophysics. This was Reid’s first spaceflight, which also included almost 13 hours as lead spacewalker during two trips outside the orbital complex. Reid also fostered a strong social media presence throughout his mission by sharing the raw emotions of spaceflight as seen through the eyes of a rookie flier. He earned a Bachelor of Science degree from Rensselaer Polytechnic Institute in Troy, New York, and a Master of Science in Systems Engineering from the Johns Hopkins University in Baltimore. He served as Chief of the Astronaut Office. Wiseman has been assigned as Commander of NASA’s Artemis II mission.",
        nationality = "American",
    ),
    Assignment(
        craft = "Orion",
        name = "Victor Glover",
        personImageUrl = "https://www.nasa.gov/wp-content/uploads/2016/02/nasa-astronaut-victor-j.-glover-.jpeg",
        personBio = "Victor J. Glover, Jr. was selected as an astronaut in 2013 while serving as a Legislative Fellow in the United States Senate. He most recently served as pilot of the Crew-1 dragon spacecraft, named Resilience, which flew to the International Space Station, where he also served as Flight Engineer for Expedition 64/65. Glover has been assigned as Pilot of NASA’s Artemis II mission around the Moon. \n" +
                "\n" +
                "The California native earned an undergraduate engineering degree as a two sport athlete, while serving his community. Glover is a Naval Aviator and was a test pilot in the F/A‐18 Hornet, Super Hornet and EA‐18G Growler. He and his family have been stationed in many locations in the United States and Japan and he has deployed in combat and peacetime. ",
        nationality = "American",
    ),
    Assignment(
        craft = "Orion",
        name = "Christina Koch",
        personImageUrl = "https://www.nasa.gov/wp-content/uploads/2023/01/jsc2018e095073_alt.jpg",
        personBio = "Christina Koch is an explorer and engineer who became astronaut in 2013. She is currently training for NASA’s Artemis II mission, planned to go around the moon next year. Her previous experience in spaceflight was living and working on the International Space Station for almost all of 2019 in Expeditions 59, 60, and 61.  For this mission, she flew on the Russian Soyuz rocket and trained extensively in Russia.  Christina spent a total of 328 consecutive days in space and participated in the first all-female spacewalks. After this spaceflight and before being assigned to Artemis II, she served as Branch Chief of the Assigned Crew Branch in the Astronaut Office and did a rotation as Assistant for Technical Integration for the Center Director at NASA’s Johnson Space Center. Prior to becoming an astronaut, Christina’s experience spanned both space science mission instrument development and remote scientific field engineering in the Antarctic and Arctic. Her hobbies include surfing, rock and ice climbing, programming, community service, triathalons, yoga, backpacking, woodworking, photography and travel.",
        nationality = "American",
    ),
    Assignment(
        craft = "Orion",
        name = "Jeremy Hansen",
        personImageUrl = "https://www.asc-csa.gc.ca/images/recherche/tiles/3feae0b8-9e9e-40cc-89c1-bece91eaf126.jpg",
        personBio = "Jeremy Roger Hansen CD FRCGS (born January 27, 1976) is a Canadian astronaut, fighter pilot, physicist and former aquanaut. He was selected to join the Canadian Space Agency in the 2009 CSA selection along with David Saint-Jacques. Prior to his selection as one of Canada's astronauts, Hansen was a Royal Canadian Air Force captain, piloting the CF-18 fighter jet at CFB Cold Lake, Alberta.",
        nationality = "Canadian",
    ),


    Assignment(
        craft = "Tiangong",
        name = "Zhang Lu",
        personImageUrl = "https://thespacedevs-prod.nyc3.digitaloceanspaces.com/media/images/zhang_lu_offici_image_thumbnail_20251030081918.jpeg",
        personBio = "Zhang Lu is a Chinese pilot selected in 2010 to be an astronaut.",
        nationality = "Chinese",
    ),
    Assignment(
        craft = "Tiangong",
        name = "Wu Fei",
        personImageUrl = "https://thespacedevs-prod.nyc3.digitaloceanspaces.com/media/images/fei_wu_image_thumbnail_20251030081821.jpeg",
        personBio = "Wu Fei is a Chinese astronaut selected as part of the Shenzhou program. He enlisted in the People's Liberation Army (PLA) Air Force in January 2021, and joined the Chinese Communist Party (CCP) in October 2015. He was a engineer at the China Academy of Space Technology (CAST) prior to joining the astronaut corps.",
        nationality = "Chinese",
    ),
    Assignment(
        craft = "Tiangong",
        name = "Hongzhang Zhang",
        personImageUrl = "https://thespacedevs-prod.nyc3.digitaloceanspaces.com/media/images/hongzhang_zhang_image_thumbnail_20251030081806.jpeg",
        personBio = "Zhang Hongzhang is a Chinese astronaut selected as a payload specialist as part of the Shenzhou program. He joined the Chinese Communist Party (CCP) in August 2004. He was a researcher on battery technology at the Chinese Academy of Sciences (CAS) Dalian Institute of Chemical Physics prior to joining the astronaut corps.",
        nationality = "Chinese",
    ),

)