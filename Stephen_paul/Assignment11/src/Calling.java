
		public class Calling {
		    public static void main(String[] args) {
		        TVREMOTE tvRemote = new TVREMOTE();
		        tvRemote.onoff();  // Call common method from Remote class
		        tvRemote.incredecrechannel();  // Call method specific to TVREMOTE

		        ACRemote acRemote = new ACRemote();
		        acRemote.onoff();  // Call common method from Remote class
		        acRemote.incredecretemp();  // Call method specific to ACRemote

		        ProjectRemote projectRemote = new ProjectRemote();
		        projectRemote.onoff();  // Call common method from Remote class
		        projectRemote.incredecreproj();  // Call method specific to ProjectRemote
		    }
		}


	


