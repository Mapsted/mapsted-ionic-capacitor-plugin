import { registerPlugin } from '@capacitor/core';

import type { MapstedPlugin } from './definitions';

const Mapsted = registerPlugin<MapstedPlugin>('Mapsted', {
  web: () => import('./web').then(m => new m.MapstedWeb()),
});

export * from './definitions';
export { Mapsted };
