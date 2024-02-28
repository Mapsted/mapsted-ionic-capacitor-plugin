# mapsted

Mapsted is the capacitor plugin for both android and ios platforms for better navigation.

## Install

```bash
npm install mapsted
npx cap sync
```

## How to use this mapsted plugin 
After installing mapsted plugin in your ionic capacitor project please follow the below steps.

## Implementation For Android

### You need to add some permissions for locations in your AndroidManifest.xml
Path – your-ionic-project\android\app\src\main\AndroidManifest.xml

### You need to add licence file in your ionic project Android platform folder.
Path - your-ionic-project\android\app\src\main\assets\demo_android_licence.key

### You need to implement sdk in build gradle file in android folder.
Path - your-ionic-project\android\build.gradle
Path - your-ionic-project\android\app\build.gradle

## Implementation For IOS

### Add licence key in your ionic project IOS platform folder.
Path - your-ionic-project\ios\App\App\Resources\ios_licence.key

### Add sdk in podfile.
Path - your-ionic-project\ios\App\Podfile

### You need to add some permissions for locations in your Info.plist file.
Path- your-ionic-project\ios\App\App\Info.plist

## You need to give location permissions for both Android and IOS platform folder. Install gelocation plugin.
Run - npm i @capacitor/geolocation

## For how to install and use Mapsted plugin you can take a reference for below Git Sample project code.

Git repository - https://github.com/Mapsted/mapsted-ionic-capacitor-plugin/tree/sample-plugin-code 


## API

<docgen-index>

* [`launchMapActivity()`](#launchmapactivity)
* [`getSearchCoreSdkCallback()`](#getsearchcoresdkcallback)
* [`getSearchFeedCallback()`](#getsearchfeedcallback)
* [`getSearchAlertCallback()`](#getsearchalertcallback)
* [`initializeMapApis()`](#initializemapapis)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->


### launchMapActivity()

```typescript
launchMapActivity() => Promise<void>
```

--------------------


### getSearchCoreSdkCallback()

```typescript
getSearchCoreSdkCallback() => Promise<any>
```

**Returns:** <code>Promise&lt;any&gt;</code>

--------------------


### getSearchFeedCallback()

```typescript
getSearchFeedCallback() => Promise<any>
```

**Returns:** <code>Promise&lt;any&gt;</code>

--------------------


### getSearchAlertCallback()

```typescript
getSearchAlertCallback() => Promise<any>
```

**Returns:** <code>Promise&lt;any&gt;</code>

--------------------


### initializeMapApis()

```typescript
initializeMapApis() => Promise<any>
```

**Returns:** <code>Promise&lt;any&gt;</code>

--------------------

</docgen-api>
