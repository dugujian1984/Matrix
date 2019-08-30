## LBS based Android App for Smart Driving

### Project Description
- Matrix is an Android Project which provides a general platform for drivers to share traffic condition events. 
- Drivers are able to register their accounts and able to login. Driver can upload events, watch events, check details and give comments on Google Map interface.
- Matrix uses cutting-edge framework Firebase to establish flexible and maintainable backend service group. Uses Toolbar, ViewPager and NavigationView combination to build user-friendly UI framework. Integrated Google Map to allow users checking instant events at their convenience. 

### Project Structure

#### 1. OnBoardingActivity

The screen where allows user to login and register as folows:

<table>
	<tr>
		<td><img src="/images/Login.png" width="200x"></td>
		<td><img src="/images/Register.png" width="200x"></td>
	</tr>
</table>

<table>
    <tr>
        <td>Part</td> 
        <td>Files Related</td> 
		<td>Description</td> 
    </tr>
    <tr>
        <td rowspan="2">OnBoardingActivity</td>    
        <td>OnBoardingActivity.java</td>  
		<td>The screen where allows user to login and register</td>  
    </tr>
    <tr>
        <td>res/layout/activity_on_boarding.xml</td>  
		<td>Layout file</td>  
    </tr>
	<tr>
		<td>Viewpager</td> 
        <td>OnBoardingActivity.java</td>  
		<td>It uses the OnBoardingPageAdapter to load LoginFragment and RegisterFragment</td>  
    </tr>
	<tr>
		<td>OnBoardingBaseFragment</td> 
        <td>OnBoardingBaseFragment.java</td>  
		<td>Base fragment of the Login and RegisterFragment which has the shared logic setup</td>  
    </tr>
	<tr>
		<td rowspan="2">LoginFragment</td> 
        <td>LoginFragment.java</td>  
		<td>Extends OnBoardingBaseFragmentBase and defines the login related business logic</td>  
    </tr>
	<tr>
        <td>res/layout/fragment_login.xml</td>  
		<td>LoginFragment’s layout file</td>  
    </tr>
		<tr>
		<td rowspan="2">RegisterFragment</td> 
        <td>RegisterFragment.java</td>  
		<td>Extends OnBoardingBaseFragmentBase and defines the register related business logic</td>  
    </tr>
	<tr>
        <td>res/layout/fragment_login.xml</td>  
		<td>RegisterFragment’s layout file</td>
    </tr>
</table>


#### 2. ControlPanelActivity

Control Panel is the container of everything inside, including MainFragment. 
Other than that Fragments, ControlPanel also contains ToolBar and Navigation View

<table>
	<tr>
		<td><img src="/images/ToolBar.png" width="200x"></td>
		<td><img src="/images/NavigationView.png" width="200x"></td>
	</tr>
</table>

<table>
    <tr>
        <td>Part</td> 
        <td>Files Related</td> 
		<td>Description</td> 
    </tr>
    <tr>
        <td rowspan="2">Toolbar</td>    
        <td>ControlPanel.java</td>  
		<td>ControlPanel includes Toolbar</td>  
    </tr>
    <tr>
        <td>res/layout/activity_control_panel.xml</td>  
		<td>ControlPanel includes Toolbar</td>  
    </tr>
	<tr>
		<td rowspan="4">NavigationView</td> 
        <td>ControlPanel.java</td>  
		<td>ControlPanel includes NavigationView</td>  
    </tr>
	<tr>
        <td>res/layout/activity_control_panel.xml</td>  
		<td>ControlPanel includes NavigationView</td>  
    </tr>
        <td>res/layout/nav_header.xml</td>  
		<td>The layout of navigationview header, at the top</td>  
    </tr>
	<tr>
        <td>res/menu/drawer_view.xml</td>  
		<td>The menu item below navigationvie header, includes settings & homes</td>
    </tr>
</table>


#### 3. MainFragment

Main Fragment is the main user interface, it includes several features：

##### 3.1. MainFragment (Main Feature)

The main feature, it shows Google Map and event on screen:
	
<table>
    <tr>
        <td>Part</td> 
        <td>Files Related</td> 
		<td>Description</td> 
    </tr>
    <tr>
        <td rowspan="4">MainFragment (Main Feature)</td>    
        <td>ControlPanel.java</td>  
		<td>ControlPanel contains MainFragment</td>  
    </tr>
    <tr>
        <td>MainFragment.java</td>  
		<td>Main Fragment logic java file</td>  
    </tr>
	<tr>
        <td>res/layout/fragment_main.xml</td>  
		<td>Main Fragment main UI container</td>  
    </tr>
	<tr>
        <td>res/raw/style_json</td>  
		<td>Styling Google map</td>  
    </tr>
</table>
	
		
##### 3.2. MainFragment (Upload Event)

Open ReportDialog and take the dialog’s callback to upload Event to Firebase (Click button on right-bottom corner of picture above)

<table>
	<tr>
		<td><img src="/images/MainFragment.png" width="200x"></td>
		<td><img src="/images/SpeechInput.png" width="200x"></td>
	</tr>
</table>
	
<table>
    <tr>
        <td>Part</td> 
        <td>Files/Functions Related</td> 
		<td>Description</td> 
    </tr>
    <tr>
        <td rowspan="6">MainFragment (Upload Event)</td>    
        <td>MainFragment.java</td>  
		<td>Main Fragment contains Upload Event Feature</td>  		
    </tr>
    <tr>
		<td><I>showdialog</I></td> 
		<td>Open the ReportDialog</td>  		
    </tr>
    <tr>
        <td><I>askSpeechInput</I></td>  
		<td>Open the system speech recognition</td>  
    </tr>
	<tr>
        <td><I>startCamer</I></td>  
		<td>Take the callback from ReportDialog and open the camera</td>  
    </tr>
	<tr>
        <td><I>onSubmit and uploadImage</I></td>  
		<td>Take the callback and data from ReportDialog and uploadEvent</td>  
    </tr>
	<tr>
        <td><I>interface DialogCallBack</I></td>  
		<td>MainFragment’s callback listener from ReportDialog</td>  
    </tr>
</table>	
	
	
##### 3.3. ReportDialog

ReportDialog is dialog opened from MainFragment and used to display the event spec and report page. 
Users could switch between two page to choose the event type and data they are going to report

<table>
	<tr>
		<td><img src="/images/ReportEventType.png" width="200x"></td>
		<td><img src="/images/ReportEventSpec.png" width="200x"></td>
		<td><img src="/images/ReportEventSpecWithImg.png" width="200x"></td>
	</tr>
</table>	
	
<table>
    <tr>
        <td>Part</td> 
        <td>Files Related</td> 
		<td>Description</td> 
    </tr>
    <tr>
        <td rowspan="6">ReportDialog</td>
		<td>res/layout/dialog.xml</td> 
		<td>The top level of the reportdialog’s UI</td>  		
    </tr>
    <tr>
        <td>res/values/styles.xml</td>  
		<td>It defines the style of the dialog</td>  
    </tr>
	<tr>
        <td>res/layout/report_event_type.xml</td>  
		<td>The first page of upload event, set event type</td>  
    </tr>
	<tr>
        <td>res/layout/report_event_spec.xml</td>  
		<td>The second page of upload event, set event details</td>  
    </tr>
	<tr>
        <td>ReportRecyclerViewAdapter.java</td>  
		<td>Recycler view adapter for setting up event type</td>  
    </tr>
	<tr>
        <td>res/layout/recyclerview_item.xml</td>  
		<td>Recycler view child view that is going to adapt to recycler view</td>  
    </tr>
</table>	


##### 3.4. MainFragment (Bottom Sheet)

Display Event details in BottomSheet (Click any event on screen)
	
<table>
	<tr>
		<td><img src="/images/Bottom1.png" width="200x"></td>
		<td><img src="/images/Bottom2.png" width="200x"></td>
	</tr>
</table>	
	
<table>
    <tr>
        <td>Part</td> 
        <td>Files Related</td> 
		<td>Description</td> 
    </tr>
    <tr>
        <td rowspan="2">MainFragment (Bottom Sheet)</td>
		<td>MainFragment.java</td> 
		<td>Main Fragment contains Upload Bottom Sheet</td>  		
    </tr>
    <tr>
        <td>res/layout/fragment_main.xml</td>  
		<td>Nested layout (Id: nestedScrollView), this is the bottom Sheet layout container</td>  
    </tr>
</table>


#### 4. Helper Classes

<table>
    <tr>
        <td>Part</td> 
        <td>Files Related</td> 
		<td>Description</td> 
    </tr>
    <tr>
        <td rowspan="6">Helper</td>
		<td>Item.java</td> 
		<td>Holds all item attributes, this is used to show ReportRecyclerViewAdapter</td>  		
    </tr>
    <tr>
        <td>TrafficEvent.java</td>  
		<td>Holds all traffic event attributes</td>  
    </tr>
	<tr>
        <td>User.java</td>  
		<td>Holds all user attributes</td>  
    </tr>
	<tr>
        <td>LocationTracker.java</td>  
		<td>Get longitude and latitude of current location</td>  
    </tr>
	<tr>
        <td>Config.java</td>  
		<td>Temperary Configurations</td>  
    </tr>
	<tr>
        <td>Utils.java</td>  
		<td>Store util functions</td>  
    </tr>
</table>


#### 5. Firebase Notifications

These files are used related to firebase cloud messaging, firebase cloud function and firebase database.

<table>
	<tr>
		<td><img src="/images/Notification.png" width="200x"></td>
	</tr>
</table>
	
<table>
    <tr>
        <td>Part</td> 
        <td>Files Related</td> 
		<td>Description</td> 
    </tr>
    <tr>
        <td rowspan="2">Firebase Cloud Messaging</td>
		<td>MyFirebaseMessagingService.java</td> 
		<td>Main Receiver of Firebase Cloud Messaging</td>  		
    </tr>
    <tr>
        <td>MatrixApplication.java</td>  
		<td>Help to register Firebase Cloud Messaging token when application boots</td>  
    </tr>
</table>