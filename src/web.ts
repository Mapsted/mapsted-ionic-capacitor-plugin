import { WebPlugin } from '@capacitor/core';

import type { MapstedPlugin } from './definitions';

export class MapstedWeb extends WebPlugin implements MapstedPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
  async launchMapActivity(): Promise<void> {
    // Implement your logic for launching MapstedMapActivity on the web platform.
    console.log('launchMapActivity called on the web platform');
  }

  async getSearchCoreSdkCallback(): Promise<any> {
    // Implement your logic for getting SearchCoreSdkCallback on the web platform.
    console.log('getSearchCoreSdkCallback called on the web platform');
    return {};
  }

  async getSearchFeedCallback(): Promise<any> {
    // Implement your logic for getting SearchFeedCallback on the web platform.
    console.log('getSearchFeedCallback called on the web platform');
    return {};
  }

  async getSearchAlertCallback(): Promise<any> {
    // Implement your logic for getting SearchAlertCallback on the web platform.
    console.log('getSearchAlertCallback called on the web platform');
    return {};
  }

  async initializeMapApis(): Promise<any> {
    // Implement your logic for initializing Map APIs on the web platform.
    console.log('initializeMapApis called on the web platform');
    return {};
  }
}
const Example = new MapstedWeb();

export { Example };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(Example);
