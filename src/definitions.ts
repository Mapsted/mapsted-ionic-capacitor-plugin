declare module '@capacitor/core'{
  interface PluginRegister{
    Example:MapstedPlugin;
  }
}
export interface MapstedPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  launchMapActivity(): Promise<void>; // Add this method for launching MapstedMapActivity
  getSearchCoreSdkCallback(): Promise<any>;
  getSearchFeedCallback(): Promise<any>;
  getSearchAlertCallback(): Promise<any>;
  initializeMapApis(): Promise<any>;
}
